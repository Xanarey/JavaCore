package NewPatterns.structural.bridge;

public class Runner {
    public static void main(String[] args) {
        Shop shop = new Shop(new JavaDeveloper());
        shop.developProgram();

        AdvertisingAgency advertisingAgency = new AdvertisingAgency(new CppDeveloper());
        advertisingAgency.developProgram();
    }
}
