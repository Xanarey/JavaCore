package MyPatterns.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developerList = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developerList.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developerList.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creating in progress...");
        for (Developer developer: developerList) {
            developer.writeCode();
        }
    }
}
