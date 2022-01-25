package ChapsStart;

public class Client implements Callback{

    public void callback(int param) {
        System.out.println("Метод callback() вызываемый со значением: " + param);
    }

    void nonIfaceMeth() {
        System.out.println("В классах реализующих инт, могут быть и др. члены");
    }
}
