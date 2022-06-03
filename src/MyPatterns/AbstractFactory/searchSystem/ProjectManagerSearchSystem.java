package MyPatterns.AbstractFactory.searchSystem;

import MyPatterns.AbstractFactory.ProjectManager;

public class ProjectManagerSearchSystem implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manage project search system . . .");
    }
}
