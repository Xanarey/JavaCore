package NewPatterns.creational.builder;

public abstract class TeamDeveloperBuilder {
    Developer developer;

    abstract void buildName();
    abstract void buildAge();
    abstract void buildSpecialty();

    public Developer getDeveloper() {
        return developer;
    }

    public void createDeveloper(){
        developer = new Developer();
    }

    @Override
    public String toString() {
        return "TeamDeveloperBuilder{" +
                "developer=" + developer +
                '}';
    }
}
