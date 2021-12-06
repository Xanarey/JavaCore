public class NoBody {
    public static void main(String[] args) {
        int j, i;
        i = 200;
        j = 100;

        while(++j < --i);
        System.out.println("Average value = " + i);
    }
}
