package NewPatterns.behavioral.Comand;

public class Merge implements Command{
    GitHub gitHub;

    public Merge(GitHub gitHub) {
        this.gitHub = gitHub;
    }

    @Override
    public void execute() {
        gitHub.merge();
    }
}
