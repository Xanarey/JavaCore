package NewPatterns.behavioral.State;

public class Car {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Start){
            setActivity(new Drive());
        } else if (activity instanceof Drive){
            setActivity(new Refuel());
        } else if (activity instanceof Refuel){
            setActivity(new DrownOut());
        } else if (activity instanceof DrownOut){
            setActivity(new Start());
        }
    }

    public void useCar(){
        activity.machineUse();
    }
}
