package p2;

import p1.Protection;

public class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("Конструктор из " +
                "другого пакета");
        System.out.println("n_pub = " + p.n_pub);
    }

}
