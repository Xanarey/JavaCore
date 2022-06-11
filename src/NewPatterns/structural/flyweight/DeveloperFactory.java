package NewPatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> DEVELOPER_HASH_MAP = new HashMap<>();

    public Developer getDeveloperForSpecialty(String specialty){
        Developer developer = DEVELOPER_HASH_MAP.get(specialty);

        if (developer == null){
            switch (specialty) {
                case "java" -> {
                    System.out.println("Create Java developer");
                    developer = new JavaDeveloper();
                }
                case "cpp" -> {
                    System.out.println("Create Cpp developer");
                    developer = new CppDeveloper();
                }
            }
            DEVELOPER_HASH_MAP.put(specialty, developer);
        }

        return developer;
    }
}
