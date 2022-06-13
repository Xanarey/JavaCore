package NewPatterns.behavioral.State;

public class Start implements Activity{
    @Override
    public void machineUse() {
        System.out.println("Car start");
    }
}
