package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String empty = null;
        //.ofNullable() uzywamy gdy w optionalu moze byc null
        Optional<String> stringOptional = Optional.ofNullable(empty);

        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        }

        String name = "Tomek";
        //.of() uzywamy gdy w optionalu nie ma null
        Optional<String> nameOptional = Optional.of(name);

        //jesli w srodku jest null to wyrzuci nam 'other'
        //.orElse() jesli optional przechowuje null to wtedy da nam obiekt z tej metody
        //obiekt zawsze zostanie stworzony
        var name1 = nameOptional.orElse("Kamil");
        System.out.println(".orElse(): " + name1);

        //.orElseGet()
        //jesli obiekt w optional nie jest null to oEG nie stworzy obiektu String "Kamil"
        var name2 = nameOptional.orElseGet(() -> "Kamil");
        System.out.println(".orElseGet(): " + name2);

        //.orElseThrow()
        nameOptional.orElseThrow(() -> new RuntimeException("W optionalu nic nie było"));
        stringOptional.orElseThrow(() -> new RuntimeException("W optionalu nic nie było"));
    }
}
