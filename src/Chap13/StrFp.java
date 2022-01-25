package Chap13;

public strictfp class StrFp {
    public static void main(String[] args) {
        System.out.println("ChapsStart.Test");
    }
    private static strictfp void methOf() {
        System.out.println("ChapsStart.Test2");
    }
    public native int meth();
}
