package ChapsStart;

public class A {
    int i, j;

    void showij() {
        System.out.println("i and j " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showij() {
        System.out.println("i and j and k " + i + " " + j + " " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb = ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subOb = ");
        subOb.showij();
        System.out.println();


        System.out.println("Сумма i, j and k in subOb = ");
        subOb.sum();
    }
}