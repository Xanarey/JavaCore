package NewPatterns.creational.abstractFactory;

public class JanitorForeman implements NewPatterns.creational.abstractFactory.CleaningCompany.JanitorForeman {
    @Override
    public void putThingsInOrder() {
        System.out.println("supervise cleaning");
    }
}
