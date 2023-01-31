package lecture.lambda.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 5, 7, 2, 3, 78, 43, 1, 6, 36, 13);
        System.out.println("Pierwotna lista liczb : " + numbers);
        System.out.println("Tylko liczby parzyste: " + process(numbers, n -> n % 2 == 0));
        System.out.println("Tylko liczby większe od 10: " + process(numbers, n -> n > 10));
        System.out.println("Tylko liczby nieparzyste: " + process(numbers, n -> n % 2 != 0));
    }

    private static List<Integer> process(List<Integer> numbers, ProcessInterface processInterface) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (processInterface.anotherProcess(number)) {
                result.add(number);
            }
        }
        return result;

    }
}
