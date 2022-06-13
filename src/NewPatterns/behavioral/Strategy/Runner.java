package NewPatterns.behavioral.Strategy;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();

        car.setActivity(new Start());
        car.executeActivity();

        car.setActivity(new Drive());
        car.executeActivity();

        car.setActivity(new DrownOut());
        car.executeActivity();

        car.setActivity(new Refuel());
        car.executeActivity();

        car.setActivity(new Start());
        car.executeActivity();

        car.setActivity(new Drive());
        car.executeActivity();

        car.setActivity(new DrownOut());
        car.executeActivity();
    }
}
