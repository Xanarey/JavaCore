package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        List arrayList  = new ArrayList<>();

        arrayList.add(-1);
        arrayList.add(53);
        arrayList.add(23);
        arrayList.add(-42);
        arrayList.add(95);
        arrayList.add(12);
        arrayList.add(36);
        arrayList.add(15);

        System.out.println("Initial arrayList:");

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);


        Comparator comparator = Comparator.reverseOrder();
        Collections.sort(arrayList, comparator);
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
