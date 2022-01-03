package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();

        System.out.println("Adding elements : ");

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("INitial: ");

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        System.out.println("=============================");

        ListIterator listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            Integer element = (Integer) listIterator.next();
            listIterator.set(element * 10);
        }

        System.out.println("=============================");

        iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        System.out.println("=============================");

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}
