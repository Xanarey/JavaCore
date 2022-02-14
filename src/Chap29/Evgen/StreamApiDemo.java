package Chap29.Evgen;

import Chap29.Evgen.model.Specialist;
import Chap29.Evgen.model.Specialty;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {
        collect().forEach((specialty, specialists) -> {
            System.out.println(specialty);
            specialists.stream().forEach(specialist -> System.out.println(" " + specialist));
            System.out.println();
        });
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
