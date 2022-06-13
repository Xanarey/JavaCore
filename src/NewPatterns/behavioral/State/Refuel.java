package NewPatterns.behavioral.State;

public class Refuel implements Activity{
    @Override
    public void machineUse() {
        System.out.println("Refuel car");
    }
}
