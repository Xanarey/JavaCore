package NewPatterns.SOLID.S;

public class Main {
    public static void main(String[] args) {

    }
}

//class Employee {
//    int getSalary() { return 10; }
//    void cook() {}
//    void cleanFloor() {}
//    void deliverFood() {}
//}

interface Employee {
    int getSalary();
}

class Cook implements Employee {
    void cook() {}

    @Override
    public int getSalary() {
        return 50;
    }
}

class Janitor implements Employee {
    void cleanFloor() {}

    @Override
    public int getSalary() {
        return 90;
    }
}