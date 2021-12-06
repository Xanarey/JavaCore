public class TestEquals {
    int a, b;

    TestEquals(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(TestEquals o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
