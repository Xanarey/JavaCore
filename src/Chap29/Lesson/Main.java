package Chap29.Lesson;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Animal> animalsList = getAnimals();

        // отфильтровать и собрать в коллекцию

        Stream<Animal> animalStream = animalsList
                .stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR));
        List<Animal> collect = animalStream.collect(Collectors.toList());

        collect.forEach(System.out::println);
        System.out.println();

        // сортировка по возрасту и собрать в коллекцию

        List<Animal> animalList = animalsList
                .stream().sorted(Comparator.comparing(Animal::getAge))
                .collect(Collectors.toList());

        animalList.forEach(System.out::println);
        System.out.println();

        System.out.println("TAKE WHILE");
        Stream<Animal> takeWhile = animalsList.stream().dropWhile(animal -> animal.getAge() > 3);
        takeWhile.forEach(System.out::println);

        boolean noneMatch = animalList.stream().noneMatch(animal -> animal.getName().equals("Test"));
        System.out.println("None match " + noneMatch);

        Optional<Animal> max = animalList.stream().max(Comparator.comparing(Animal::getAge));
        System.out.println(max);
        System.out.println();

        //   пересобрать в мапу и вывести мапу на печать

        System.out.println("MAP: ");
        Map<Classification, List<Animal>> classificationListMap = animalList
                .stream()
                .collect(Collectors.groupingBy(Animal::getClassification));
        classificationListMap.forEach((classification, animals) -> {
            System.out.println(classification);
            animals.forEach(System.out::println);
            System.out.println();
        });

        System.out.println("Самое староже хищное животное: ");

        Optional<String> stringOptional = animalList
                .stream()
                .max(Comparator.comparing(Animal::getAge))
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .map(Animal::getName);
        stringOptional.ifPresent(System.out::println);
    }
    private static List<Animal> getAnimals() {
        return List.of(
                new Animal("Слон", 20, Classification.HERBIVORE),
                new Animal("Лев", 10, Classification.PREDATOR),
                new Animal("Гиена", 11, Classification.PREDATOR),
                new Animal("Жираф", 7, Classification.HERBIVORE),
                new Animal("Гибон", 35, Classification.OMNIVOROUS),
                new Animal("Лошадь", 36, Classification.HERBIVORE),
                new Animal("Рысь", 2, Classification.PREDATOR),
                new Animal("Динозавр", 200, Classification.PREDATOR)
        );
    }

}
