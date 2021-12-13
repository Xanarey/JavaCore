class FirstQs implements Cloneable{
    public static void main(String[] args)  {
        FirstQs ob1 = new FirstQs();
        Object ob2 = ob1.clone();

        System.out.println(ob1.getClass());
        System.out.println(ob2.getClass());
        System.out.println(ob1.equals(ob2));
        System.out.println(ob1);
        System.out.println(ob2);
    }


    @java.lang.Override
    public FirstQs clone() {
        try {
            return (FirstQs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class Car implements Cloneable {
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
        return (Car) super.clone();
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
        Car car = new Car("Грузовик" , new Driver("Васец", 53));
        Car clonedCar = car.clone();
        System.out.println("ORIGINAL: " + car);
        System.out.println("CLONE   : " + clonedCar);

        Driver clonedCarDriver = clonedCar.getDriver();
        clonedCarDriver.setName("Vasya");

        System.out.println("ORIGINAL 2: " + car);
        System.out.println("CLONE 2   : "  + clonedCar);
    }
}