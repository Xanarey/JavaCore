package NewPatterns.behavioral.Comand;

public class Runner {
    public static void main(String[] args) {
        GitHub gitHub = new GitHub();
        Developer developer = new Developer(
                new Merge(gitHub),
                new Pull(gitHub),
                new Request(gitHub)
        );

        developer.commandMerge();
        developer.commandPull();
        developer.commandRequest();
    }
}
