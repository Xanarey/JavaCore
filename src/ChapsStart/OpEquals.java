package ChapsStart;

public class OpEquals {
    public static void main(String[] args) {
        int а = 1;
        int b = 2;
        int с = 3;
        а += 5;
        b *= 4;
        с += а * b;
        с %= 6;
        System.out.println("a " + а);
        System.out.println("b " + b);
        System.out.println("c " + с);
    }
}
