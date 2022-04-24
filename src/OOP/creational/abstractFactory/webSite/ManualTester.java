package OOP.creational.abstractFactory.webSite;

import OOP.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("ManualTester tests website code...");
    }
}
