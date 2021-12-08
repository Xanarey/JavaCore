public class PassArray {

    static void vaTest(int[] v) {
        System.out.print("Количество аргументов vaTest: " + v.length
        + " содержимое: ");

        for(int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest2(int ... v) {
        System.out.print("Количество аргументов vaTest2: " + v.length
                + " содержимое: ");

        for(int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest3(int a, int b, int ... v) {
        System.out.print("Количество аргументов переменной длины vaTest3: " + v.length
                + " содержимое: ");
        System.out.print(a + " " + b + " ");
        for(int x: v)
            System.out.print(x + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        int[] n1 = {10};
        int[] n2 = {10,12,14};
        int[] n3 = {};
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);

        vaTest2(1,2,3);
        vaTest2(4,5,6,7);
        vaTest2();

        vaTest2(n1);

        vaTest3(1,2,3);
        vaTest3(4,5,6,7);

    }

}
