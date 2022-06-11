package NewPatterns.structural.bridge;

public class Shop extends Program{
    public Shop(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        developer.writeCode();
    }
}
