package MyPatterns.behavioral.Command;

public class InsertCommand implements Command{
    Datebase datebase;

    public InsertCommand(Datebase datebase) {
        this.datebase = datebase;
    }

    @Override
    public void execute() {
        datebase.insert();
    }
}
