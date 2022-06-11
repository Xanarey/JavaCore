package NewPatterns.creational.factoryMethod;

public class HR_Factory_language implements HR_factory{

    @Override
    public HR_employer createHR() {
        return new HR_language();
    }
}
