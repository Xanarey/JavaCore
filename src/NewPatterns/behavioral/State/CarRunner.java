package NewPatterns.behavioral.State;

public class CarRunner {
    public static void main(String[] args) {
        Activity activity = new DrownOut();
        Car car = new Car();

        car.setActivity(activity);
        car.useCar();

        for (int i = 0; i < 8; i++){
            car.changeActivity();
            car.useCar();
        }
    }
}
