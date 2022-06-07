package MyPatterns.structural.Decorator;

public class JavaTeamLeadDeveloper extends DeveloperDecorator{
    public JavaTeamLeadDeveloper(Developer developer) {
        super(developer);
    }

    public String teamControl() {
        return " Team coding control... ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + teamControl();
    }
}
