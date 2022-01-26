package Chap29;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        System.out.print("Исходные значения : ");
        myList.forEach(a -> System.out.println(a + " "));

        IntStream cStrm = myList.stream().mapToInt(a -> (int)Math.ceil(a));
        System.out.print("Максимально допустимые значения : ");
        cStrm.forEach(a -> System.out.print(a + " "));
    }
}
