package OOP.creational.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    projectManager getProjectManager();
}
