package NewPatterns.creational.builder;

public class DeveloperBuilder {
    TeamDeveloperBuilder teamDeveloperBuilder;

    public DeveloperBuilder(TeamDeveloperBuilder teamDeveloperBuilder) {
        this.teamDeveloperBuilder = teamDeveloperBuilder;
    }

    public void createDeveloper(){
        teamDeveloperBuilder.createDeveloper();
        teamDeveloperBuilder.buildSpecialty();
        teamDeveloperBuilder.buildAge();
        teamDeveloperBuilder.buildName();
    }

    public Developer getDeveloper() {
        return teamDeveloperBuilder.getDeveloper();
    }
}
