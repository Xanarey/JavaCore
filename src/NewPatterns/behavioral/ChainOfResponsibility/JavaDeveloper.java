package NewPatterns.behavioral.ChainOfResponsibility;

public class JavaDeveloper extends Notifier{
    public JavaDeveloper(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println(" Java code ..." + message);
    }
}
