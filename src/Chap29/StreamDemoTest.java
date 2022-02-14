package Chap29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemoTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(9);
        System.out.println("Исходный: " + arrayList);

        Stream<Integer> stream = arrayList.stream();

        Optional<Integer> minVal = stream.min(Integer::compare);
        minVal.ifPresent(integer -> System.out.println("min " + integer));

        stream = arrayList.stream();

        Optional<Integer> maxVal = stream.max(Integer::compare);
        maxVal.ifPresent(integer -> System.out.println("max " + integer));

        stream = arrayList.stream();

        Stream<Integer> sortedVal = stream.sorted();

        sortedVal.forEach(integer -> System.out.println(" " + integer));

        Stream<Integer> oddVal = arrayList.stream().sorted().filter(integer -> integer % 2 == 1);
        oddVal.forEach(integer -> System.out.println("odd " + integer));

        Stream<Integer> evenVal = arrayList.stream().sorted().filter(integer -> integer % 2 == 0);
        evenVal.forEach(integer -> System.out.println("even " + integer));

        Stream<Integer> odd5Val = arrayList.stream().sorted().
                filter(integer -> integer % 2 == 1).
                filter(integer -> integer > 5);
        odd5Val.forEach(integer -> System.out.println("odd5 " + integer));
    }
}
