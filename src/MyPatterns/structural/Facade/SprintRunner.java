package MyPatterns.structural.Facade;

public class SprintRunner {
    public static void main(String[] args) {
        Job job = new Job();
        job.doJob();
        Developer developer = new Developer();
        BugTracker bugTracker = new BugTracker();

        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);

        bugTracker.finishSprint();
        developer.doJobBeforeDeadLine(bugTracker);

    }
}
