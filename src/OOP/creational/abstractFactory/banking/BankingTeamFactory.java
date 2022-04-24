package OOP.creational.abstractFactory.banking;

import OOP.creational.abstractFactory.Developer;
import OOP.creational.abstractFactory.ProjectTeamFactory;
import OOP.creational.abstractFactory.Tester;
import OOP.creational.abstractFactory.projectManager;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public projectManager getProjectManager() {
        return new PMBanking();
    }
}
