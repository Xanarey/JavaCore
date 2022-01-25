package ChapsStart;

public class A4 {
    A4() {
        System.out.println("В конструкторе А4");
    }
}

class B4 extends A4 {
    B4() {
        System.out.println("В конструкторе В4");
    }
}

class C4 extends B4 {
    C4() {
        System.out.println("В конструкторе С4");
    }
}

class ABC4 {
    public static void main(String[] args) {
        C4 c4 = new C4();

    }
}