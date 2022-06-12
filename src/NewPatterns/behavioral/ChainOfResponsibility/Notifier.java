package NewPatterns.behavioral.ChainOfResponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier){
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int levelPriority){
        if (priority >= levelPriority){
            write(message);
        }
        if (nextNotifier != null){
            nextNotifier.notifyManager(message, levelPriority);
        }
    }

    public abstract void write(String message);
}
