package NewPatterns.SOLID.D;

public class Main {
    public static void main(String[] args) {

    }
}

interface DAO {
    void execute();
}

class Client {
    DAO dataAccess = new DataAccess();

    void doJob() {
        dataAccess.execute();
    }
}

class DataAccess implements DAO{
    @Override
    public void execute() {
        System.out.println("execute");
    }
}

