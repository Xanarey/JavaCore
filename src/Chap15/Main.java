package Chap15;

interface MonitoringSystem {

    void startMonitoring();

}

public class Main {

    public static void main(String[] args) {

        MonitoringSystem generalModule = () -> System.out.println("Мониторинг общих систем");
        MonitoringSystem errorModule = () -> System.out.println("Мониторинг ошибок");
        MonitoringSystem securityModule = () -> System.out.println("Мониторинг безопасности стартовал");

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();

    }

}
