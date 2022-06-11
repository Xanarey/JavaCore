package NewPatterns.creational.factoryMethod;

public class HR_screening implements HR_employer{
    @Override
    public void employ() {
        System.out.println("conduct light screening");
    }
}
