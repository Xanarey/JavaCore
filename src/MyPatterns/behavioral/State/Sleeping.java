package MyPatterns.behavioral.State;

public class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping");
    }
}
