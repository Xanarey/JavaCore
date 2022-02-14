package Chap29;

import java.util.ArrayList;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(17);
        arrayList.add(72);
        arrayList.add(27);
        arrayList.add(73);
        arrayList.add(47);

        Optional<Integer> optionalInteger = arrayList.stream().reduce((a, b) -> a * b);
        optionalInteger.ifPresent(integer -> System.out.println(" " + integer));

        int product = arrayList.stream().reduce(2, (a, b) -> a * b);
        System.out.println(" : " + product);
    }
}
