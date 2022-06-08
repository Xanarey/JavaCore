package MyPatterns.behavioral.Iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Timur Brek", skills);

        Iterator iterator = javaDeveloper.getIterator();

        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
