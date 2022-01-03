package Collections;

import java.util.Comparator;

public class Developer implements Comparator {
    private String name;
    private int salary;

    public Developer() {
    }

    public Developer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int compareTo(Developer developer) {
        return this.name.compareTo(developer.name);
    }


    public int compare(Developer developer1, Developer developer2) {
        return developer1.salary - developer2.salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setName("Artem");
        developer.setSalary(6000);
        developer.setName("Tim");
        developer.setSalary(4000);
        System.out.println(developer.compare(developer,developer));
    }
}