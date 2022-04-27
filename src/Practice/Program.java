package Practice;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = checkDeveloperSpecialty("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory checkDeveloperSpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown");
        }
    }
}
