package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Tomek");
        queue.add("Kamil");
        queue.offer("Tomek");
        queue.offer("Kamil");
        System.out.println(queue.poll()); //to samo co peek plus usuwamy element z kolejki
        System.out.println(queue.peek()); //dostanie sie do elementu

    }
}
