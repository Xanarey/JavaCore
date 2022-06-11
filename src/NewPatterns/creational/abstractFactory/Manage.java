package NewPatterns.creational.abstractFactory;

import NewPatterns.creational.abstractFactory.CleaningCompany.Manager;

public class Manage implements Manager {
    @Override
    public void manage() {
        System.out.println("Manage process");
    }
}
