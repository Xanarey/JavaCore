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

        for(j = 1; j < size - 1; j++)
            for(i = j; i < size - 1; i++) {
                sum = array[j] + array[i];
                if(sum == value) {
                    res[0] = j;
                    res[1] = j + 1;
                }
            }
        return res;
    }
}