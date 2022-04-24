package OOP.creational.abstractFactory;

import OOP.creational.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        projectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bankSystem...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
