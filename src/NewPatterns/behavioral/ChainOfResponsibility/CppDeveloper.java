package NewPatterns.behavioral.ChainOfResponsibility;

public class CppDeveloper extends Notifier{
    public CppDeveloper(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Cpp code... " + message);
    }
}
