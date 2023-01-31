package lecture.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        //chcemy przechowywac wszystkie oceny danego ucznia
        //Janek
        String jan = "Jan";
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
        classroom.put(jan, ocenyJan);
        classroom.put(basia, ocenyBasia);

        //wyswietlamy uczniow wraz z ocenami
        var entrySet = classroom.entrySet();
        for (Map.Entry<String, List<Integer>> record : entrySet) {
            System.out.println("Uczeń: " + record.getKey() + " oceny: " + record.getValue());
        }

        //dodawanie oceny janowi
//        classroom.get("Jan").add(1);

        //liczenie sredniej z ocen
        System.out.println("To ma równać się 4.0: " + countAvgForStudents(classroom).get("Basia"));

    }

    //TODO obsłużyć wyjątek dzielenia przez 0
    private static Map<String, Double> countAvgForStudents(Map<String, List<Integer>> students) {
        Map<String, Double> result = new HashMap<>();

        for (Map.Entry<String, List<Integer>> record : students.entrySet()) {
            Integer sum = 0;
            for (Integer grade : record.getValue()) {
                sum += grade;
            }
            Double average = (double) sum / record.getValue().size();
            result.put(record.getKey(), average);
        }
        return result;
    }
}
