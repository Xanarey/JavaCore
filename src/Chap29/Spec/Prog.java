package Chap29.Spec;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Prog {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>(
                List.of(new Person("Vasya", 20),
                        new Person("Evgen", 29),
                        new Person("Tim", 26))
        );

        //personList.stream().forEach(System.out::println);
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);

    }


}
