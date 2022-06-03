package MyPatterns.FactoryMethod;

public class MitsubishiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mitsubishi();
    }
}
