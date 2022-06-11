package NewPatterns.creational.abstractFactory;

import NewPatterns.creational.abstractFactory.CleaningCompany.Driver;
import NewPatterns.creational.abstractFactory.CleaningCompany.JanitorForeman;
import NewPatterns.creational.abstractFactory.CleaningCompany.Recruiter;

public interface CompanyFactory {
    Driver getDriver();
    JanitorForeman getJanitorForeman();
    Manage getManager();
    Recruiter getRecruiter();
}
