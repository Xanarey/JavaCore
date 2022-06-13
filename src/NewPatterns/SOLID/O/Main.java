package NewPatterns.SOLID.O;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Toyota();
        Car celica = new Celica();
        workInTaxi(toyota);
    }
    static void workInTaxi(Car car) {
        car.workInTaxi();
    };
}

interface Car {
    void workInTaxi();
}

class Toyota implements Car{
    void getPassengers() {
        System.out.println("get passengers");
    }
    @Override
    public void workInTaxi() {
        getPassengers();
    }
}

class Celica implements Car {
    void getPassenger() {
        System.out.println("get one passenger");
    }
    @Override
    public void workInTaxi() {
        getPassenger();
    }
}
