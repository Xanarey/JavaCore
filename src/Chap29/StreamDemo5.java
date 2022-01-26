package Chap29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}

class NamePhone {
    String name;
    String phonenum;

    public NamePhone(String name, String phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }
}

public class StreamDemo5 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Ларри", "555-5555", "karara@gmail.com"));
        myList.add(new NamePhoneEmail("Эмм", "232-2343", "tururu@gmail.com"));
        myList.add(new NamePhoneEmail("Том", "324-3243", "mimimi@gmail.com"));

        System.out.println("Исходные элементы из списка myList: ");
        myList.forEach((a) -> {
                    System.out.println(a.name + " " + a.phonenum
                            + " " + a.email);
                });
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));
        System.out.println("Список имен и номеров телефонов : ");
        nameAndPhone.forEach(a -> {
            System.out.println(a.name + " " + a.phonenum);
        });
    }
}
