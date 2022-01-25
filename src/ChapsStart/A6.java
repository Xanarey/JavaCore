package ChapsStart;

class A6 {
    int i, j;

    A6(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B6 extends A6 {
    int k;

    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override2 {
    public static void main(String[] args) {
        B6 b6 = new B6(1,2,3);

        b6.show("Это k: ");

        b6.show();
    }
}