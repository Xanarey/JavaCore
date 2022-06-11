package NewPatterns.creational.builder;

public class CppDeveloperBuilder extends TeamDeveloperBuilder{
    @Override
    void buildName() {
        developer.setName("Cpp");
    }

    @Override
    void buildAge() {
        developer.setAge(25);
    }

    @Override
    void buildSpecialty() {
        developer.setSpecialty(Specialty.CPP);
    }
}
