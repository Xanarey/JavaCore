package NewPatterns.creational.builder;

public class JavaDeveloperBuilder extends TeamDeveloperBuilder{
    @Override
    void buildName() {
        developer.setName("JavaDev");
    }

    @Override
    void buildAge() {
        developer.setAge(24);
    }

    @Override
    void buildSpecialty() {
        developer.setSpecialty(Specialty.JAVA);
    }
}
