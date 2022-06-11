package NewPatterns.structural.bridge;

public class AdvertisingAgency extends Program{
    public AdvertisingAgency(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        developer.writeCode();
    }
}
