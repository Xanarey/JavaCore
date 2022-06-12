package NewPatterns.behavioral.ChainOfResponsibility;

public class PhpDeveloper extends Notifier{
    public PhpDeveloper(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println(" PHP message ..." + message);
    }
}
