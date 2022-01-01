package exercise;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Exercise_2 {

    public static void main(String[] args) {
        // ====== 1 ======
        int[] array = {4, 5, 6, 7, 3, 1, 2, 2, 1};

        System.out.println(getSt(array));


        // ===== 2 ======
        Set tracking = new HashSet();
        Set dupl = new HashSet();
        System.out.println("before: " + dupl.size());

        for(Object item: array) {
            if(!tracking.add(item)) {
                dupl.add(item);
            }
        }
        System.out.println("after: " + dupl.size());
    }

    public static boolean getSt(int[] array) {

        int size = array.length;
        int i = 0, j = 0;
        boolean res = false;

            for(j = 0; j < size - 1; j++)
                for(i = j + 1; i < size; i++) {
                    if(array[j] == array[i]) {
                        res = true;
                    }
                }
        return res;
    }
}
