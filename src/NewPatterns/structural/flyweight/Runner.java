package NewPatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developerList = new ArrayList<>();

        developerList.add(developerFactory.getDeveloperForSpecialty("java"));
        developerList.add(developerFactory.getDeveloperForSpecialty("java"));
        developerList.add(developerFactory.getDeveloperForSpecialty("java"));
        developerList.add(developerFactory.getDeveloperForSpecialty("cpp"));
        developerList.add(developerFactory.getDeveloperForSpecialty("cpp"));

        for (Developer d: developerList) d.writeCode();
    }
}
