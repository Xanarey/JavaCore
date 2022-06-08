package MyPatterns.behavioral.Command;

public class SelectCommand implements Command{
    Datebase datebase;

    public SelectCommand(Datebase datebase) {
        this.datebase = datebase;
    }

    @Override
    public void execute() {
        datebase.select();
    }
}
