package MyPatterns.behavioral.Command;

public class DeleteCommand implements Command{
    Datebase datebase;

    public DeleteCommand(Datebase datebase) {
        this.datebase = datebase;
    }

    @Override
    public void execute() {
        datebase.delete();
    }
}
