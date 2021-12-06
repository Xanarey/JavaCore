public class PassOb {
    public static void main(String[] args) {
        Test t1 = new Test(100,22);
        Test t2 = new Test(100,22);
        Test t3 = new Test(-1,-1);

        System.out.println("ob1 == ob2: " + t1.equalTo(t2));
        System.out.println("ob1 == ob3: " + t1.equalTo(t3));

        System.out.println("Применение нативного equals без переопределения");

        System.out.println("ob1 == ob2: " + t1.equals(t2));
        System.out.println("ob1 == ob3: " + t1.equals(t3));
    }
}
