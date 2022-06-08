package MyPatterns.behavioral.Command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Datebase datebase = new Datebase();
        Developer developer = new Developer(
                new InsertCommand(datebase),
                new DeleteCommand(datebase),
                new SelectCommand(datebase),
                new UpdateCommand(datebase)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
