package NewPatterns.behavioral.ChainOfResponsibility;

public class Runner {
    public static void main(String[] args) {
        Notifier notifier = new JavaDeveloper(Priority.low);
        Notifier notifier1 = new PhpDeveloper(Priority.medium);
        Notifier notifier2 = new CppDeveloper(Priority.high);

        notifier.setNextNotifier(notifier1);
        notifier1.setNextNotifier(notifier2);
        notifier.notifyManager("TESTTESTSTEST", Priority.high);

    }
}
