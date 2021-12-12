class A9 {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class B9 implements A9.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String[] args) {
        A9.NestedIF nif = new B9();

        if(nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательное");
        if(nif.isNotNegative(-12))
            System.out.println("--");
        System.out.println();


    }
}