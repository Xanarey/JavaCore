package OOP.creational.abstractFactory.webSite;

import OOP.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PhpDev writes php code...");
    }
}
