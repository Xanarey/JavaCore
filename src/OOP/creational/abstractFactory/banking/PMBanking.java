package OOP.creational.abstractFactory.banking;

import OOP.creational.abstractFactory.projectManager;

public class PMBanking implements projectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
