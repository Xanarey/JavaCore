package Collections.II;

import java.util.LinkedList;
import java.util.ListIterator;

public class MainDel {

    public static void main(String[] args) {
        LinkedList<Integer> list = getRandomList();

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            int item = iterator.next();
            if(item >= 128) {
                iterator.remove();
            }
        }

        // list.removeIf(item -> item >= 128);    быстрее


        for(Integer integer: list) {
            System.out.println(integer);
        }

    }

    public static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 100000; i++) {
            list.add((int) (Math.random() * 256));
        }
        return list;
    }

}
