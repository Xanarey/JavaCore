package NewPatterns.behavioral.Observer;

public class Runner {
    public static void main(String[] args) {
        TeamChat teamChat = new TeamChat();

        teamChat.addTask("First_task");
        teamChat.addTask("Second_task");

        Observer worker1 = new Worker("Tomas");
        Observer worker2 = new Worker("Nick");

        teamChat.addObserver(worker1);
        teamChat.addObserver(worker2);

        teamChat.addTask("Third_task");

        teamChat.removeTask("First_task");
    }
}
