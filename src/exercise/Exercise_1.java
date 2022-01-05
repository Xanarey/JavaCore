package exercise;


import java.util.*;

class Exercise_1 {

    public static void main(String[] args) {
        int[] a = {15, 7, 8, 1};
        System.out.println(Arrays.toString(getValue(a, 23)));
    }

    public static int[] getValue(int[] array, int value) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i]) && i != map.get(array[i])) {
                return new int[] {map.get(array[i]), i};
            }
            map.put(value - array[i], i);
        }
        return new int[2];
    }
}
