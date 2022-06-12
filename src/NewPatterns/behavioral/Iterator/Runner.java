package NewPatterns.behavioral.Iterator;

public class Runner {
    public static void main(String[] args) {
        String[] skills = {"JavaCore", "Collection", "IO, NIO", "MLTHRD"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Timur Brek", skills);

        Iterator iterator = javaDeveloper.getIterator();

        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
