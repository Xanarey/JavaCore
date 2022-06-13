package NewPatterns.behavioral.Visitor;

public class DateBase implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
