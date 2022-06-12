package NewPatterns.behavioral.Comand;

public class Developer {
    private final Command pull;
    private final Command merge;
    private final Command request;

    public Developer(Command pull, Command merge, Command request) {
        this.pull = pull;
        this.merge = merge;
        this.request = request;
    }

    public void commandPull(){
        pull.execute();
    }

    public void commandMerge(){
        merge.execute();
    }

    public void commandRequest(){
        request.execute();
    }
}
