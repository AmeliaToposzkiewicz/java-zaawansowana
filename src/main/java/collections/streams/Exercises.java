package collections.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Exercises {
    public static void main(String[] args) {

        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Szwata");
        Person rozalia = new Person("Rozalia", "Kobylska");
        Person maciej = new Person("Maciej", "Puszkowski");
        Person tomasz = new Person("Tomasz", "Wojtyra");

        List<Person> people = List.of(jan, karolina, rozalia, maciej, tomasz);

        //stworz liste imion w ktorej nie bedzie osob z nazwiskiem na litere K oraz zwrocone tylko imie

        var names = people.stream().filter(person -> !(person.getSurname().startsWith("K"))).map(person -> person.getName()).toList();
        System.out.println(names);

        //zamiana imion z nazwiskiem
        var resultList = people.stream().map(person -> String.format("%s %s", person.getSurname(), person.getName())).toList();
        System.out.println(resultList);


        //Janek
        String janek = "Jan";
        Integer matematyka1 = 1;
        Integer biologia1 = 5;
        List<Integer> ocenyJan = List.of(matematyka1, biologia1);

        //Basia
        String basia = "Basia";
        Integer matematyka2 = 4;
        Integer biologia2 = 4;

        //klasa
        List<Integer> ocenyBasia = List.of(matematyka2, biologia2);
        Map<String, List<Integer>> classroom = new HashMap<>();
        classroom.put(janek, ocenyJan);
        classroom.put(basia, ocenyBasia);

        //wyswietlanie za pomoca lambdy klucza i wartosci
        classroom.forEach((k, v) -> System.out.println(k + v));

        var result = classroom.entrySet().stream().filter(stringListEntry -> stringListEntry.getKey().equals("Basia")).toList();

    }
}
