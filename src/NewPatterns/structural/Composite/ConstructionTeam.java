package NewPatterns.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class ConstructionTeam {
    private List<Worker> workerList = new ArrayList<>();

    public void addWorker(Worker worker){
        workerList.add(worker);
    }

    public void removeWorker(Worker worker){
        workerList.remove(worker);
    }

    public void send_a_team_to_work(){
        for (Worker w: workerList){
            w.work();
        }
    }
}
