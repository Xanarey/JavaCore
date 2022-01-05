package Chap18;

public class ExecDemoFini {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("NotePad");
        } catch (Exception e) {
            System.out.println("Ошибка запуска NotePad");
        }
        assert p != null;
        System.out.println("NotePad вернул: " + p.exitValue());
    }
}
