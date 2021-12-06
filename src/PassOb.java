public class PassOb {
    public static void main(String[] args) {
        TestEquals t1 = new TestEquals(100,22);
        TestEquals t2 = new TestEquals(100,22);
        TestEquals t3 = new TestEquals(-1,-1);

        System.out.println("ob1 == ob2: " + t1.equalTo(t2));
        System.out.println("ob1 == ob3: " + t1.equalTo(t3));

        System.out.println("Применение нативного equals без переопределения");

        System.out.println("ob1 == ob2: " + t1.equals(t2));
        System.out.println("ob1 == ob3: " + t1.equals(t3));
    }
}
