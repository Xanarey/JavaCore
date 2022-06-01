package Patterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new PhpDeveloperFactory();

        developerFactory.createDeveloper().writeCode();
    }
}
