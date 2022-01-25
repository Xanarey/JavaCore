package Chap20;

import java.util.Date;
import java.util.Calendar;

public class DateDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        System.out.println(date);

        long msec = date.getTime();
        System.out.println(msec + " : количество миллисекунд с 01.01.1970");

        String[] months = {"Jan","Feb","Mar",
                "Apr","May","Jun",
                "Jul","Aug","Sep",
                "Oct","Nov","Dec"};

        System.out.print("Date: ");
        System.out.print(months[calendar.get(Calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DATE));
        System.out.println(" " + calendar.get(Calendar.YEAR));
        System.out.print("TIME: " + calendar.get(Calendar.HOUR));
        System.out.print(":" + calendar.get(Calendar.MINUTE));
        System.out.print(":" + calendar.get(Calendar.SECOND));
    }
}
