package MyPatterns.behavioral.Visitor;

public class Project implements ProjectElement{
    ProjectElement[] projectElements;

    public Project(){
        projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element: projectElements){
            element.beWritten(developer);
        }
    }
}
