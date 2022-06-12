package NewPatterns.behavioral.Comand;

public class Pull implements Command{
    GitHub gitHub;

    public Pull(GitHub gitHub) {
        this.gitHub = gitHub;
    }

    @Override
    public void execute() {
        gitHub.pull();
    }
}
