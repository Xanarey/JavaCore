package Chap29.Evgen;

import Chap29.Evgen.model.Specialist;
import Chap29.Evgen.model.Specialty;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiDemo {

    public static void main(String[] args) {
//        peekAction();
//        getMap();

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        Optional<String> sentence = wordsStream.reduce((x,y)->x + " " + y);
        sentence.ifPresent(System.out::println);
    }

    public static List<Specialist> getSpecialists() {
        return List.of(
                new Specialist("Ivan Ivanov", new BigDecimal(5000), Specialty.ENGINEER),
                new Specialist("Alexander Alexandrov", new BigDecimal(4000), Specialty.ENGINEER),
                new Specialist("Sergey Sergeev", new BigDecimal(3000), Specialty.DEVOPS),
                new Specialist("Fedor Fedorov", new BigDecimal(2000), Specialty.DEVOPS),
                new Specialist("Kirill Kirillov", new BigDecimal(10000), Specialty.MANAGER),
                new Specialist("Petr Petrov", new BigDecimal(10000), Specialty.MANAGER)
        );
    }

    public static void peekAction() {
        getSpecialists().stream()
                .peek(specialist -> specialist.setSalary(new BigDecimal(1000)))
                .forEach(System.out::println);
    }

    public static void getMap() {
         getSpecialists().stream()
                 .map(Specialist::getSalary)
                 .forEach(System.out::println);
    }

    public static List<Enum.EnumDesc<Specialty>> flatMap() {
        return getSpecialists().stream()
                //.map(Specialist::getSpecialty)
                .flatMap(specialist -> specialist.getSpecialty().describeConstable().stream())
                .collect(Collectors.toList());
    }

//          .flatMap(human -> human.getPets().stream())


//        List<Human> humans = asList(
//                new Human("Sam", asList("Buddy", "Lucy")),
//                new Human("Bob", asList("Frankie", "Rosie")),
//                new Human("Marta", asList("Simba", "Tilly")));
//
//        List<String> petNames = humans.stream()
//                .map(human -> human.getPets()) //преобразовываем Stream<Human> в Stream<List<Pet>>
//                .flatMap(pets -> pets.stream())//"разворачиваем" Stream<List<Pet>> в Stream<Pet>
//                .collect(Collectors.toList());


    public static Optional<Specialist> findFirst() {
        return getSpecialists().stream().findFirst();

    }

    public static Optional<Specialist> findAny() {
        return getSpecialists().stream().findAny();

    }

    public static boolean emptyStream() {
        return getSpecialists().isEmpty();
    }

    public static boolean findEngineer() {
        return getSpecialists().stream().anyMatch(specialist -> specialist.getSpecialty().equals(Specialty.ENGINEER));
    }

    public static Map<Specialty, List<Specialist>> collect() {
        return getSpecialists().stream()
                .sorted(Comparator.comparing(Specialist::getSalary))
                .collect(Collectors.groupingBy(Specialist::getSpecialty));
    }

    public static Optional<Specialist> getMaxSalary() {
        return getSpecialists().stream().max(Comparator.comparing(Specialist::getSalary));
    }

    public static List<Specialist> getName() {
        return getSpecialists()
                .stream()
                .sorted(Comparator.comparing(Specialist::getName))
                .collect(Collectors.toList());
    }

    public static List<Specialist> getEngineer() {
        return getSpecialists()
                .stream()
                .filter(specialist -> specialist.getSpecialty().equals(Specialty.ENGINEER))
                .collect(Collectors.toList());
    }





}
