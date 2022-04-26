package OOP.creational;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
}
