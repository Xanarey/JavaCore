package NewPatterns.creational.prototype;

public class Runner {
    public static void main(String[] args) {
        DeveloperInfo developerInfo1 = new DeveloperInfo("Tomas", 32, "CPPDEV");

        DeveloperFactory developerFactory = new DeveloperFactory();
        DeveloperInfo developerInfo2 = developerFactory.createCopyDeveloperInfo(developerInfo1);

        System.out.println(developerInfo1);
        System.out.println(developerInfo2);



    }
}
