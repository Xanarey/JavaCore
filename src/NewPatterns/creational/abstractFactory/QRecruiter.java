package NewPatterns.creational.abstractFactory;

import NewPatterns.creational.abstractFactory.CleaningCompany.Recruiter;

public class QRecruiter implements Recruiter {
    @Override
    public void employ() {
        System.out.println("hire");
    }
}
