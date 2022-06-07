package MyPatterns.creational.AbstractFactory.searchSystem;

import MyPatterns.creational.AbstractFactory.Developer;
import MyPatterns.creational.AbstractFactory.ProjectManager;
import MyPatterns.creational.AbstractFactory.ProjectTeamFactory;
import MyPatterns.creational.AbstractFactory.Tester;

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
