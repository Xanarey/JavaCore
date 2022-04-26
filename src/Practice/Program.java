package Practice;

//      ПОРОЖДАЮЩИЕ ПАТТЕРНЫ
// FactoryMethod
// AbstractFactory
// Singleton
// Builder
// Prototype

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();


    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        }
        else if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        }
        else if (specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty ");
        }
    }


}

interface DeveloperFactory {
    Developer createDeveloper();
}

class newJavaDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write Java code");
    }
}

class newCppDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write Cpp code");
    }
}

interface Developer {
    void writeCode();
}

//class JavaDeveloper {
//    void writeJavaCode() {
//        System.out.println("Write Java code");
//    }
//}
//
//class CppDeveloper {
//    void writeCppCode() {
//        System.out.println("Write Cpp code");
//    }
//}