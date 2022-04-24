package OOP.creational.abstractFactory.webSite;

import OOP.creational.abstractFactory.Developer;
import OOP.creational.abstractFactory.ProjectTeamFactory;
import OOP.creational.abstractFactory.Tester;
import OOP.creational.abstractFactory.projectManager;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public projectManager getProjectManager() {
        return new WebSitePM();
    }
}
