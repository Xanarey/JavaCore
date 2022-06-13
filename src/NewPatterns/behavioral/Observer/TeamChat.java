package NewPatterns.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class TeamChat implements Observed{
    List<String> tasks = new ArrayList<>();

    List<Observer> workers = new ArrayList<>();

    public void addTask(String task){
        tasks.add(task);
        notifyObservers();
    }

    public void removeTask(String task){
        tasks.remove(task);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        workers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        workers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: workers){
            o.handleEvent(tasks);
        }
    }
}
