package exercise;

import java.util.Arrays;

class Exercise_1 {

    public static void main(String[] args) {
        int[] a = {3, 8, 15, 17};
        System.out.println(Arrays.toString(getValue(a, 23)));
    }

    public static int[] getValue(int[] array, int value) {

        int[] res = {0, 0};
        int size = array.length;
        int i, j, sum = 0;

        outer:
        for(j = 0; j < size; j++)
            for(i = j + 1; i < size; i++) {
                sum = array[j] + array[i];
                if(sum == value) {
                    res[0] = j;
                    res[1] = i;
                    break outer;
                }
            }
        return res;
    }
}

// [3, 8, 15, 17]       /         23