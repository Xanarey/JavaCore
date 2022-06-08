package MyPatterns.behavioral.Command;

public class UpdateCommand implements Command{
    Datebase datebase;

    public UpdateCommand(Datebase datebase) {
        this.datebase = datebase;
    }

    @Override
    public void execute() {
        datebase.update();
    }
}
