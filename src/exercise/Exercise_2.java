package exercise;

//Array: [4,5,6,6,8]
//Result: true

//Array: [4,5,6,7,8]
//Result: false


public class Exercise_2 {

    static int i = 0,j = 0;
    static boolean res = false;

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 3, 1, 2};

        System.out.println(getSt(array));
    }

    public static boolean getSt(int[] array) {

        int size = array.length;

            for(j = 0; j < size - 1; j++)
                for(i = j + 1; i < size; i++) {
                    if(array[j] == array[i]) {
                        res = true;
                    }
                }

        return res;
    }
}
