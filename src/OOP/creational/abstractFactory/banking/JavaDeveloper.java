package OOP.creational.abstractFactory.banking;

import OOP.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code.");
    }
}
