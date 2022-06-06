package MyPatterns.structural.Facade;

public class SprintRunner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();

        workflow.solveProblems();

        workflow.bugTracker.finishSprint();
        workflow.developer.doJobBeforeDeadLine(workflow.bugTracker);

    }
}
