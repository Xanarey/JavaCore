package exercise;

import java.util.Arrays;

class Exercise_1 {

    public static void main(String[] args) {
        int[] a = {3, 8, 15, 17};
        System.out.println(Arrays.toString(getValue(a, 23)));
    }

    public static int[] getValue(int[] array, int value) {
        int[] arr = array;
        int[] res = new int[2];
        int size = arr.length;
        int i, j = 0;

        for(j = size - 1; j > 0; --j)
            for(i = j; i > 0; i--)
                if(arr[j] + arr[i] == value) {
                    res[0] = i;
                    res[1] = j;
                }
        return res;
    }
}