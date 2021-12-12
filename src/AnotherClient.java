class AnotherClient implements Callback{

    public void callback(int param) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("р в квадрате = " + (param * param));
    }
}

class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;

        c.callback(42);
    }
}
