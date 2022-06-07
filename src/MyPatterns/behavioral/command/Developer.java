package MyPatterns.behavioral.command;

public class Developer {
    Command insert;
    Command select;
    Command update;
    Command delete;

    public Developer(Command insert, Command select, Command update, Command delete) {
        this.insert = insert;
        this.select = select;
        this.update = update;
        this.delete = delete;
    }

    public void insertRecord(){
        insert.execute();
    }

    public void updateRecord(){
        insert.execute();
    }

    public void deleteRecord(){
        insert.execute();
    }

    public void selectRecord(){
        insert.execute();
    }
}
