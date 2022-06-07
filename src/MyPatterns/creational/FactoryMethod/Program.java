package MyPatterns.creational.FactoryMethod;

public class Program {
    public static void main(String[] args) {
        createCarFactory("porshe").createCar().drive();
    }

    static CarFactory createCarFactory(String carName) {
        if (carName.equalsIgnoreCase("mitsubishi")) {
            return new MitsubishiFactory();
        } else if (carName.equalsIgnoreCase("porshe")){
            return new PorsheFactory();
        }
        else throw new RuntimeException(carName + " is unknown!");
    }
}
