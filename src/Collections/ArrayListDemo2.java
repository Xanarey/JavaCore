package Collections;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0,12);
        list.set(0,9);
        Object[] a = list.toArray();


        System.out.println(list.get(1));
        System.out.println(list);
        System.out.println(a[0]);
    }
}

class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();
    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println(waitingEmployees);
        paySalary("Нифрод");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
    }

    public static void paySalary(String name) {
        if(waitingEmployees.contains(name) && name != null) {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }
    }
}

class Solution2 {
    public static int[] numbers = new int[] {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};
    static ArrayList<Integer> integerArrayList = new ArrayList<>();

    public static void main(String[] args) {
        init();
        System.out.println(integerArrayList);

        sort();
        System.out.println(integerArrayList);
    }

    public static void init() {
        for(int i = 0; i < numbers.length; i++) {
            int pop = numbers[i];
            integerArrayList.add(i, pop);
        }
    }


    public static void reverse() {
            int size = integerArrayList.size();
            for(int i = 0; i < size / 2; i++) {
                int pop = integerArrayList.get(i);
                integerArrayList.set(i, integerArrayList.get(size - i - 1));
                integerArrayList.set(size - i - 1, pop);
        }
    }

    public static void sort() {
        for(int i = 0; i < numbers.length; i++)
            for(int j = numbers.length - 1; j > i; j--) {
                if(integerArrayList.get(j) < integerArrayList.get(j - 1)) {
                    int pop = integerArrayList.get(j);
                    integerArrayList.set(j, j - 1);
                    integerArrayList.set(j - 1, pop);
                }
            }

    }
}