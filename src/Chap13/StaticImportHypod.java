package Chap13;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class StaticImportHypod {
    public static void main(String[] args) {
        double side1, side2;
        double hypod;
        side1 = 3.0;
        side2 = 4.0;

        hypod = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("side1 + side2" + " " + hypod);
    }
}
