package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        String s1 = "napis1";
        String s2 = "napis2";

        String[] strings = new String[10];
        strings[0] = s1;
        strings[1] = s2;
        System.out.println(strings);

        /*
        LISTA - zwykła tablica
         */
        List<String> stringList = new ArrayList<>();
        stringList.add(s1);
        stringList.add(s2);
        stringList.add(s2);
        stringList.add(s2);
        stringList.add(s2);
        stringList.remove(0);
        System.out.println(stringList);
        for (String s : stringList) {
            System.out.println(s);
        }

        System.out.println("czy lista zawiera obiekt: " + stringList.contains(s2));
        System.out.println("czy jest pusta: " + stringList.isEmpty());
        System.out.println("liczba elementów: " + stringList.size());
        //usuwanie wszystkiego z listy
        stringList.clear();

        /*
        LinkedList - zbór różnych elelemntów połączonych ze sobą
        każdy element wie jaki element jest przed nim i po nim
        jest polinkowana
         */
        String s3 = "Nowy napis";
        LinkedList <String> linkedList = new LinkedList<>();
        linkedList.addFirst(s1);
        linkedList.addLast(s2);
        linkedList.add(s3);
        linkedList.addFirst(s3);
        System.out.println("pierwszy:  " + linkedList.getFirst());
        System.out.println("ostatni: " + linkedList.getLast());
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
    }


}
