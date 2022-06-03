package MyPatterns.AbstractFactory.searchSystem;

import MyPatterns.AbstractFactory.Developer;
import MyPatterns.AbstractFactory.ProjectManager;
import MyPatterns.AbstractFactory.ProjectTeamFactory;
import MyPatterns.AbstractFactory.Tester;

public class SearchTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new CppDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new ProjectManagerSearchSystem();
    }
}
