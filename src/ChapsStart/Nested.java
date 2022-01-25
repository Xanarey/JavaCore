package ChapsStart;

public class Nested {
    public static void main(String[] args) {
        int i, j;

        for(i = 0; i < 10; i++) {
            for(j = 10; j > i; j--)
                System.out.print(".");
            System.out.println();
        }
    }
}
