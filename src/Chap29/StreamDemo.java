package Chap29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(17);
        myList.add(71);
        myList.add(27);
        myList.add(72);
        myList.add(37);
        myList.add(74);
        myList.add(75);

        System.out.println("Исходный список : " + myList);

        Stream<Integer> myStream = myList.stream();

        Optional<Integer> minVal = myStream.min(Integer::compare);
        minVal.ifPresent(integer -> System.out.println("Min value : " + integer));

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        maxVal.ifPresent(integer -> System.out.println("Max value : " + integer));


        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.println("Отсортированный поток данных: ");
        sortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddValues = myList.stream().sorted().filter(n -> (n % 2) == 1);
        System.out.print("ODD value : ");
        oddValues.forEach(n -> System.out.print(n + " "));
        System.out.println();


        Stream<Integer> evenValue = myList.stream().sorted().filter(n -> (n % 2) == 0);
        System.out.print("EVEN values : ");
        evenValue.forEach(n -> System.out.print(n + " "));
        System.out.println();

        oddValues = myList.stream().filter(n -> (n % 2) == 1) .filter(n -> n > 5);
        System.out.print("Нечетные значения больше 5: ");
        oddValues.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
