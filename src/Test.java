public class Test {

    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class ParamPassing {

    public static void main(String[] args) {
        int data = 10;
        System.out.println(data);
        processData(data);
        System.out.println(data);
    }

    private static void processData(int data) {
        data = data * 10;
    }
}