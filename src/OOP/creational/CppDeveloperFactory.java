package OOP.creational;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        return new CppDeveloper();
    }
}
