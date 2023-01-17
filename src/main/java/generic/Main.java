package generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SDAList<String> list = new SDAList<>();
        List<String> listFromElements = new SDAList<>("Tomek","Ola","Tadeusz");
        List<String> listOf = SDAList.of("Tomek", "Ola","Tadeusz");
        System.out.println(listOf.size());
        list.add("Józef");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Damian");
        arrayList.add("Karolina");

        System.out.println(list.union(arrayList));


    }
}
