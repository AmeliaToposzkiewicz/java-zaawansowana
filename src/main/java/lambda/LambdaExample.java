package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        Hospital internist = new Internist();
        internist.treat();

        /* klasa anonimowa
        Hospital ophthalmologist = new Hospital() {
            @Override
            public void treat() {
                System.out.println("Oklista zaczyna leczyć");
            }
        };
        */

        //wyrazenie lambda
        Hospital ophthalmologist = () -> System.out.println("Okulista zaczyna leczyć");
        ophthalmologist.treat();

        /*
        Doctor doctor = new Doctor() {
            @Override
            public String process(String s) {
                return "Hello doctor " + s + "!";
            }
        };
        */
        Doctor doctor = (s) -> {
            return "Hello doctor " + s + "!";
        };
        // Doctor doctor = (s) -> "Hello doctor " + s + "!"; tak można jak tylko jedna linijka

        var greetings = doctor.process("Damian");
        System.out.println(greetings);

        List<String> doctors = List.of("Damian", "Karol", "Matylda", "Tamara");
        var editedList = editedDoctors(doctors, (s) -> "Hello " + s);

        System.out.println(editedList);
    }

    private static List<String> editedDoctors(List<String> doctors, Doctor doctor) {
        var result = new ArrayList<String>();
        for (String name : doctors) {
            result.add(doctor.process(name));
        }
        return result;
    }
}
