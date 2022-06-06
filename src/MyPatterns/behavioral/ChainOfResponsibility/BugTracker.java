package MyPatterns.behavioral.ChainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotiifer = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotiifer = new SimpleReportNotifier(Priority.IMPORTANT);
        Notifier smsNotiifer = new SimpleReportNotifier(Priority.ASAP);


    }
}
