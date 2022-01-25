package ChapsStart;

class A3 {
    int i;
}

class B3 extends A3 {
    int i;

    B3(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B3 b3 = new B3(1,2);

        b3.show();
    }
}
