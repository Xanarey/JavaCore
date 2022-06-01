package Patterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        createDeveloperBySpecialty("php").createDeveloper().writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();}
        else if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();}
        else if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown");
        }
    }
}
