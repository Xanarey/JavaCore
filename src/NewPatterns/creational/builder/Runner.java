package NewPatterns.creational.builder;

public class Runner {
    public static void main(String[] args) {
        DeveloperBuilder developerBuilder = new DeveloperBuilder(new CppDeveloperBuilder());
        developerBuilder.createDeveloper();
        System.out.println(developerBuilder.getDeveloper());
    }
}
