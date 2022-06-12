package MyPatterns.behavioral.ChainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotiifer = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotiifer = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotiifer = new SMSNotifier(Priority.ASAP);

        reportNotiifer.notifyManager("TEST", Priority.ASAP);
        reportNotiifer.setNextNotifier(emailNotiifer);
        emailNotiifer.setNextNotifier(smsNotiifer);
    }
}
