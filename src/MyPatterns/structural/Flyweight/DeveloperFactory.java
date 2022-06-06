package MyPatterns.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> DEVELOPER_MAP = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = DEVELOPER_MAP.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "java":
                    System.out.println("Hiring Java Developer");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring C++ Developer");
                    developer = new CppDeveloper();
                    break;
            }

            DEVELOPER_MAP.put(specialty, developer);
        }

        return developer;
    }
}
