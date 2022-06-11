package NewPatterns.creational.abstractFactory.CleaningCompany;

import NewPatterns.creational.abstractFactory.CompanyFactory;
import NewPatterns.creational.abstractFactory.Manage;
import NewPatterns.creational.abstractFactory.QRecruiter;

public class CleaningCompany implements CompanyFactory {
    @Override
    public Driver getDriver() {
        return new NewPatterns.creational.abstractFactory.Driver();
    }

    @Override
    public JanitorForeman getJanitorForeman() {
        return new NewPatterns.creational.abstractFactory.JanitorForeman();
    }

    @Override
    public Manage getManager() {
        return new Manage();
    }

    @Override
    public Recruiter getRecruiter() {
        return new QRecruiter();
    }
}
