package MyPatterns.structural.Decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        Developer developer1 = new JavaSeniorDeveloper(new JavaDeveloper());
        Developer developer2 = new JavaTeamLeadDeveloper(new JavaSeniorDeveloper(new JavaDeveloper()));


        System.out.println(developer.makeJob());
        System.out.println(developer1.makeJob());
        System.out.println(developer2.makeJob());

    }
}
