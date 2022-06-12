package NewPatterns.behavioral.Comand;

public class Request implements Command{
    GitHub gitHub;

    public Request(GitHub gitHub) {
        this.gitHub = gitHub;
    }

    @Override
    public void execute() {
        gitHub.request();
    }
}
