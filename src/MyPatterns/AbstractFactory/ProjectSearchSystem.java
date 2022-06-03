package MyPatterns.AbstractFactory;

import MyPatterns.AbstractFactory.searchSystem.SearchTeamFactory;

public class ProjectSearchSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new SearchTeamFactory();

        projectTeamFactory.getDeveloper().writeCode();
        projectTeamFactory.getTester().testCode();
        projectTeamFactory.getProjectManager().manageProject();

    }
}
