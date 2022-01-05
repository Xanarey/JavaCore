package Chap18.cloneObject;

// Clonable - интерфейс маркер
// Без Clonable - CloneNotSupportedException
// clone in Object - protected -> override how public
// default clone - shallow copy

public class Car implements Cloneable{
    private String name;
    private Driver driver;

    public Car(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car clone() throws CloneNotSupportedException {
        Car newCar = (Car) super.clone();
        Driver driver = this.getDriver().clone();
        newCar.setDriver(driver);
        return newCar;
    }
}

class Driver implements Cloneable {
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Driver clone() throws CloneNotSupportedException {
        return (Driver) super.clone();
    }
}

class CloneCarDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("USUZI",new Driver("Petya",50));
        Car clonedCar = car.clone();

        System.out.println("ORIGINAL: " + car.getDriver().getName());
        System.out.println("CLONE: " + clonedCar.getDriver().getName());

        Driver cloneCarDriver = clonedCar.getDriver();
        cloneCarDriver.setName("Vasya");


        System.out.println("ORIGINAL: " + car.getDriver().getName());
        System.out.println("CLONE: " + clonedCar.getDriver().getName());
    }
}








