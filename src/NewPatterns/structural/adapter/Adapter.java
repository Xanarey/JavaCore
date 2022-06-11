package NewPatterns.structural.adapter;

public class Adapter extends JavaDeveloper implements HrWorker{
    @Override
    public void work() {
        writeCode();
    }

    @Override
    public void goWork() {
        startIdea();
    }

    @Override
    public void goHome() {
        finisWork();
    }
}
