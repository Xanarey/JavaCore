package OOP.creational.abstractFactory;

import OOP.creational.abstractFactory.webSite.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        projectManager projectManager = projectTeamFactory.getProjectManager();


        System.out.println("Creating auctionSiteProject...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
