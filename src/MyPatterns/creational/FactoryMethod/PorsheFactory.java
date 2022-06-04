package MyPatterns.creational.FactoryMethod;

public class PorsheFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Porshe();
    }
}
