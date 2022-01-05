package Chap18;

public class VerDemo {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();

        System.out.println("Осн. версия: " + version.major());
        System.out.println("Доп. версия: " + version.minor());
        System.out.println("Защита версии: " + version.security());
    }
}
