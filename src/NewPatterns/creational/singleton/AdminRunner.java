package NewPatterns.creational.singleton;

public class AdminRunner {
    public static void main(String[] args) {
        Admin admin = new Admin();

        System.out.println(Admin.getInstance());
        System.out.println(Admin.getInstance());
        System.out.println(Admin.getInstance());
        System.out.println(Admin.getInstance());
    }
}
