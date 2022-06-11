package NewPatterns.creational.singleton;

public class Admin {
    private static Admin admin;
    private static String name = "admin";

    Admin() {
    }

    public static Admin getInstance(){
        if (admin == null){
            admin = new Admin();
        }
        return admin;
    }

    public static void changeName(String name){
        Admin.name = name;
    }
}
