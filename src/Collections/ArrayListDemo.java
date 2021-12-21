package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Object> arraylist =  new ArrayList<>();

        arraylist.add("First");
        arraylist.add(12);
        arraylist.add("Second");
        arraylist.add(13);
        arraylist.add("Third");
        arraylist.add(14);

        System.out.println("Initial size: " + arraylist.size());
        System.out.println("Initial arrayList content: " + arraylist);

        arraylist.remove("First");
        arraylist.remove(2);

        System.out.println("Final size: " + arraylist.size());
        System.out.println("Final arrayList content: " + arraylist);
    }
}
