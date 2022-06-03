package OOP.creational;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }
}
