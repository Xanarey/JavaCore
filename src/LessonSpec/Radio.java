package LessonSpec;

public class Radio implements ElectricityConsumer{

    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
