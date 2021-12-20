package exercise;

public class Exercise_2 {

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 3, 1, 2};

        System.out.println(getSt(array));
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
