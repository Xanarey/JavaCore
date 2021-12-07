public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test(15,20);

        int a = 15, b = 20;

        System.out.println("a and b до вызова: " +
                ob.a + " " + ob.b);

       // ob.meth(ob);

        System.out.println("a and b после вызова: " +
                ob.a + " " + ob.b);
    }
}
