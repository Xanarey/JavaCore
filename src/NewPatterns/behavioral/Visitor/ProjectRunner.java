package NewPatterns.behavioral.Visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        project.beWritten(juniorDeveloper);
        project.beWritten(seniorDeveloper);
    }
}
