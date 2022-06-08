package MyPatterns.behavioral.Command;

public class Datebase {
    public void insert() {
        System.out.print("Inserting record...");
    }

    public void delete() {
        System.out.print("Deleting record...");
    }

    public void select() {
        System.out.print("Reading record...");
    }

    public void update() {
        System.out.print("Updating record...");
    }
}
