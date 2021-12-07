class RecTest {

    int values[];

    RecTest(int n) {
        values = new int[n];
    }

    void printArray(int n) {
        if(n == 0) return;
        else printArray(n - 1);
        System.out.println("[" + (n - 1) + "] " + values[n - 1]);
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest recTest = new RecTest(5);

        for(int i = 0; i < 5; i++)  recTest.values[i] = i;

        recTest.printArray(5);
    }
}