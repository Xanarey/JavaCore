package NewPatterns.behavioral.Observer;

import java.util.List;

public class Worker implements Observer{
    String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> tasks) {
        System.out.println("Dear " + name + " (There are changes in the work plan)." + tasks +
                "\n================================\n");
    }
}
