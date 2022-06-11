package NewPatterns.structural.Decorator;

public class Runner {
    public static void main(String[] args) {
        Worker roofer = new Roofer();
        Worker profRoofer = new ProfessionalRoofer(new Roofer());

        System.out.println(roofer.work());
        System.out.println(profRoofer.work());


    }
}
