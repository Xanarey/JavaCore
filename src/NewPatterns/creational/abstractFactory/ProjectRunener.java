package NewPatterns.creational.abstractFactory;

import NewPatterns.creational.abstractFactory.CleaningCompany.CleaningCompany;

public class ProjectRunener {
    public static void main(String[] args) {
        CompanyFactory companyFactory = new CleaningCompany();

        companyFactory.getDriver().drive();
        companyFactory.getJanitorForeman().putThingsInOrder();
        companyFactory.getManager().manage();
        companyFactory.getRecruiter().employ();
    }
}
