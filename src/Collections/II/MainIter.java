package Collections.II;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MainIter {
    public static void main(String[] args) {

        Integer[] array = new Integer[]{123,321,123,
                                        213,213,124,
                                        1234,12,432};

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, array);



        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
            for(int i = 0; i < list.size(); i++)
                System.out.println("ITERATOR: " + iterator.next());
            // ===========================================
            for(Integer integer: list)
                System.out.println(integer);
            //============================================
    }
}
