public class Array {
    public static void main(String[] args) {
        int[] monthday = new int[12];
        monthday[0] = 31;
        monthday[1] = 28;
        monthday[2] = 31;
        monthday[3] = 30;

        monthday[4] = 31;
        monthday[5] = 30;
        monthday[6] = 31;
        monthday[7] = 31;

        monthday[8] = 30;
        monthday[9] = 31;
        monthday[10] = 30;
        monthday[11] = 31;

        System.out.println("In May : " + monthday[4] + " days");
    }
}
