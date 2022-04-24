package OOP.creational.abstractFactory.webSite;

import OOP.creational.abstractFactory.projectManager;

public class WebSitePM implements projectManager {
    @Override
    public void manageProject() {
        System.out.println("WebSitePM manages webSite project...");
    }
}
