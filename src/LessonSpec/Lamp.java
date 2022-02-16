package LessonSpec;

public class Lamp implements ElectricityConsumer{

    private void lightOn() {
        System.out.println("лампа зажглась");
    }


    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
