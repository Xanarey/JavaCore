package NewPatterns.behavioral.Visitor;

public class Project implements ProjectElement{
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DateBase(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement pe: projectElements){
            pe.beWritten(developer);
        }
    }
}
