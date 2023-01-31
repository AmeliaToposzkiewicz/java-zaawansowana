package lecture.lambda.generic;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Exercise {
    public static void main(String[] args) {
        String name = "Imie";
        Integer i = 1;
        process(name, s-> System.out.println(s));
        process(i, System.out::println);
        process(new ArrayList<>(), System.out::println);


    }
    private static <T> void process(T thing, Consumer<T> consumer){
        consumer.accept(thing);
    }
}
