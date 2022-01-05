package exercise;

import java.util.HashSet;
import java.util.Set;

public class Exercise_2 {

    public static void main(String[] args) {

        int[] array = {4, 5, 6, 7, 3, 1, 2};
        System.out.println(getSt(array));
    }

    public static boolean getSt(int[] array) {

        Set tracking = new HashSet();
        Set dupl = new HashSet();
        boolean res = false;

        for(Object item: array) {
            if(!tracking.add(item)) {
                dupl.add(item);
                res = true;
            }
        }
        return res;
    }

}
