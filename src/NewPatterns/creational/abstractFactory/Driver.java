package NewPatterns.creational.abstractFactory;

public class Driver implements NewPatterns.creational.abstractFactory.CleaningCompany.Driver {
    @Override
    public void drive() {
        System.out.println("Drive car");
    }
}
