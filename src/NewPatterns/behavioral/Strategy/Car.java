package NewPatterns.behavioral.Strategy;

public class Car {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.machineUse();
    }
}
