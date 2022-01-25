package ChapsStart;

public class IfElse {
    public static void main(String[] args) {
        int month = 4; // Апрель
        String season = "";
        if (month == 12 || month == 1 || month == 2)
            season = "зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "весна";
        else if (month == 6 || month == 7 || month == 8)
            season = "лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "осень";
        else
            System.out.println("ERROR");
        System.out.println(season);
    }
}
