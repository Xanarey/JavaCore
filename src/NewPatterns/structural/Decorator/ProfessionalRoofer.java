package NewPatterns.structural.Decorator;

public class ProfessionalRoofer extends WorkerDecorator{
    public ProfessionalRoofer(Worker worker) {
        super(worker);
    }

    public String qualityRoofing(){
        return " + quality roofing";
    }

    @Override
    public String work() {
        return super.work() + qualityRoofing();
    }
}
