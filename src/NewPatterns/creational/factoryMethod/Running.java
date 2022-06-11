package NewPatterns.creational.factoryMethod;

public class Running {
    public static void main(String[] args) {
        createHRFactory("language").createHR().employ();
    }

    static HR_factory createHRFactory(String specialty){
        if (specialty.equalsIgnoreCase("screening")){
            return new HR_Factory_screening();
        } else if (specialty.equalsIgnoreCase("language")){
            return new HR_Factory_language();
        } else throw new RuntimeException(specialty + " is unknown");
    }
}
