package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Object> arraylist =  new ArrayList<>();
        List<Object> arraylist2 =  new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();

        arraylist2.add("F");
        arraylist2.add(0);

        arraylist.add("First");
        arraylist.add(12);
        arraylist.add("Second");
        arraylist.add(13);
        arraylist.add("Third");
        arraylist.add(14);
        arraylist.add(2,11);
        arraylist.addAll(0,arraylist2);
        //arraylist.clear();
        System.out.println("FOR EACH: ");
        for (Object elements : arraylist
             ) {
            System.out.println(elements);
        }
        System.out.println("IND OF" + arraylist.indexOf(12));


        System.out.println("ITERATOR: " + arraylist.listIterator().next());


        System.out.println("Initial size: " + arraylist.size());
        System.out.println("Initial arrayList content: " + arraylist);

        arraylist.remove("First");
        arraylist.remove(2);

        System.out.println("Final size: " + arraylist.size());
        System.out.println("Final arrayList content: " + arraylist);
    }
}
