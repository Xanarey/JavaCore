package Chap29;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.*;

public class _Streams_ {

    public static void main(String[] args) {
        _Streams_ streams_ = new _Streams_();
        streams_.real();
    }

    private List<Employee> emps = List.of(
            new Employee("Michael", "Smith",   243,  43, Position.CHEF),
            new Employee("Jane",    "Smith",   523,  40, Position.MANAGER),
            new Employee("Jury",    "Gagarin", 6423, 26, Position.MANAGER),
            new Employee("Jack",    "London",  5543, 53, Position.WORKER),
            new Employee("Eric",    "Jackson", 2534, 22, Position.WORKER),
            new Employee("Andrew",  "Bosh",    3456, 44, Position.WORKER),
            new Employee("Joe",     "Smith",   723,  30, Position.MANAGER),
            new Employee("Jack",    "Gagarin", 7423, 35, Position.MANAGER),
            new Employee("Jane",    "London",  7543, 42, Position.WORKER),
            new Employee("Mike",    "Jackson", 7534, 31, Position.WORKER),
            new Employee("Jack",    "Bosh",    7456, 54, Position.WORKER),
            new Employee("Mark",    "Smith",   123,  41, Position.MANAGER),
            new Employee("Jane",    "Gagarin", 1423, 28, Position.MANAGER),
            new Employee("Sam",     "London",  1543, 52, Position.WORKER),
            new Employee("Jack",    "Jackson", 1534, 27, Position.WORKER),
            new Employee("Eric",    "Bosh",    1456, 32, Position.WORKER)
    );

    private List<Department> deps = List.of(
            new Department(1, 0, "Head"),
            new Department(2, 1, "West"),
            new Department(3, 1, "East"),
            new Department(4, 2, "Germany"),
            new Department(5, 2, "France"),
            new Department(6, 3, "China"),
            new Department(7, 3, "Japan")
    );

    public void creation() throws IOException {

        // ИЗ ОБЪЕКТОВ ФАЙЛОВОЙ СИСТЕМЫ

        Stream<String> stringStream = Files.lines(Paths.get("test.txt")); // список строк в файле
        Stream<Path> pathStream = Files.list(Paths.get("./")); // список объектов в директории
        Stream<Path> walk = Files.walk(Paths.get("./"), 3); // // список объектов в директории на установленную глубину

        // ИЗ ПРИМИТИВОВ

        IntStream intStream = IntStream.of(1, 2, 3, 4);
        DoubleStream doubleStream = DoubleStream.of(1.2 , 3.4);
        LongStream longStream = LongStream.of(1L, 2L);

        // ИЗ МАССИВА

        int[] ints = {1, 2, 3, 4};
        IntStream streamArray = Arrays.stream(ints);

        // ИЗ ОБЪЕКТОВ

        Stream<String> streamObj = Stream.of("1", "2", "3");

        // СОЗДАТЬ В БИЛДЕРЕ

        Stream.<String>builder()
                .add("Test")
                .add("Test2")
                .build();

        // ИЗ КОЛЛЕКЦИИ

        Stream<Employee> employeeStream = emps.stream();
        Stream<Employee> parallelStream = emps.parallelStream();

        // ИЗ ФУНКЦИИ

        Stream<Event> eventStream = Stream.generate(() -> new Event(UUID.randomUUID(), LocalDateTime.now(), ""));

        Stream<Integer> integerStream = Stream.iterate(1955, integer -> integer + 3);

        // Сложение двух стримов

        Stream<String> concat = Stream.concat(streamObj, stringStream);

    }

    // ПРОМЕЖУТОЧНЫЕ ОПЕРАЦИИ (ЦЕПОЧКИ)
    public void transform() {

        LongStream longStream = IntStream.of(100, 200, 300).mapToLong(Long::valueOf);
        IntStream.of(100, 200, 300).mapToObj(value ->
                new Event(UUID.randomUUID(), LocalDateTime.of(value, 12, 1, 1, 1), " "));
        IntStream.of(100, 200, 300, 400, 100, 200).distinct(); // получение элементов стрима без дубликатов

        // сотрудники не являющиеся шефом
        Stream<Employee> employeeStream = emps.stream().filter(employee -> employee.getPosition() != Position.CHEF);

        Stream<Employee> employeeStreamSkip = emps.stream().skip(3);// пропуск N элементов с начала стрима
        Stream<Employee> employeeStreamLimit = emps.stream().limit(5); // отображение первых N записей

        Stream<Employee> limit = emps.stream().skip(10).limit(5); // пример цепочки

        Stream<Employee> sortedAge = emps.stream().sorted(((o1, o2) -> o1.getAge() - o2.getAge())); // сортировка по возрасту
        Stream<Employee> sortedAge2 = emps.stream().sorted((Comparator.comparingInt(Employee::getAge))); // с компаратором
        emps.stream()
                .sorted(((o1, o2) -> o1.getAge() - o2.getAge()))
                .peek(employee -> employee.setAge(18))
                .map(employee -> String.format("%s %s ", employee.getFirstName(), employee.getLastName()));

        emps.stream().takeWhile(employee -> employee.getAge() > 30);
        // выводить сотрудников , пока их возраст более 30
        emps.stream().dropWhile(employee -> employee.getAge() > 30).forEach(System.out::println);
        // начать выводить сотрудников , когда встретиться с возрастом более 30

        System.out.println("TEST");

        IntStream.of(100, 200, 300, 400)
                .flatMap(value -> IntStream.of(value - 50, value))
                .forEach(System.out::println);
    }

    // ПОТРЕБЛЯЮЩИЕ СТРИМ (ОКОНЕЧНЫЕ ОПЕРАЦИИ)
    public void terminate() {
        emps.stream().count(); // количество

        emps.stream().forEach(employee -> System.out.println(" " + employee.getAge()));
        emps.forEach(employee -> System.out.println(" " + employee.getAge()));

        emps.stream().forEachOrdered(employee -> System.out.println(" " + employee.getAge()));

        //  преобразования стрима к коллекции

        List<Employee> collect = emps.stream().collect(Collectors.toList());

        //  преобразование стрима коллекции в массив

        emps.stream().toArray();

        // преобразование коллекции листа в мапу

        Map<Integer, String> integerStringMap = emps.stream().collect(Collectors.toMap(
                Employee::getId,
                employee -> String.format("%s %s ", employee.getFirstName(), employee.getLastName())
        ));

        // сложение элементов    reduce ( сумма, следующий в очереди )
        IntStream intStream = IntStream.of(100, 200, 300, 400);
        intStream.reduce((a, b) -> a + b).orElse(0);

        // reduce с объектами

        System.out.println(deps.stream().reduce(this::reducer));

        // возврат булевого значения из стрима

        emps.stream().noneMatch(employee -> employee.getAge() > 50); // true
        emps.stream().allMatch(employee -> employee.getAge() > 18); //
        emps.stream().anyMatch(employee -> employee.getPosition() == Position.CHEF); // true
    }

    public Department reducer(Department parent, Department child) {
        if (child.getParent() == parent.getId()) {
            parent.getChild().add(child);
        } else {
            parent.getChild().forEach(subParent -> reducer(subParent, child));
        }

        return parent;
    }

    public void real() {
        Stream<Employee> empl = emps.stream()
                .filter(employee ->
                        employee.getAge() <= 30 && employee.getPosition() != Position.WORKER
                )
                .sorted(Comparator.comparing(Employee::getLastName));

        print(empl);
    }

    private void print(Stream<Employee> stream) {
        stream
                .map(emp -> String.format(
                        "%4d | %-15s %-10s age %s %s",
                        emp.getId(),
                        emp.getLastName(),
                        emp.getFirstName(),
                        emp.getAge(),
                        emp.getPosition()
                ))
                .forEach(System.out::println);

        System.out.println();
    }
}
