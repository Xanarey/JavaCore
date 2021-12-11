package mypack;

class Balance {
    String name;
    double bal;

    Balance(String n, double d) {
        name = n;
        bal = d;
    }

    void show() {
        if(bal < 0)
            System.out.println("-->");
        System.out.println(name + ": $" + bal);
    }
}

class AccountBalance {
    public static void main(String[] args) {
        Balance[] current = new Balance[3];

        current[0] = new Balance("K. J. Fielding",132.24);
        current[1] = new Balance("Q. B. Tell",13.2);
        current[2] = new Balance("D. F. Soul",12.4);

        for (Balance balance : current) balance.show();
    }
}