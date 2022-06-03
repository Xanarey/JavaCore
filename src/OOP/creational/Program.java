package OOP.creational;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = checkedDeveloperFactory("php");
        Developer developer = developerFactory.getDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory checkedDeveloperFactory(String specialty) {
        if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        }  else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is ignored . . .");
        }
    }
}
