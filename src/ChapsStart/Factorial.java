package ChapsStart;

class Factorial {

    int fact(int n) {

        int result;

        if(n == 1) return 1;

        result = n * fact(n - 1);
        return result;
    }

}

class Recursion {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("FACT[5] = " + factorial.fact(5));
        System.out.println("FACT[4] = " + factorial.fact(4));
    }
}
