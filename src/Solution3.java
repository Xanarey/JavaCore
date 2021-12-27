import java.util.ArrayList;

public class Solution3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 1; i <= 20; i++) {
            if(i%2 == 0)
                arrayList.add(i);
        }

        System.out.println(arrayList);

        for(int i = 0; i < arrayList.size(); i++)
            if(arrayList.get(i)%4 == 0)
                arrayList.remove(i--);

        System.out.println(arrayList);

        for(int i = 0; i < 3; i++) {
            int j = arrayList.size();
            arrayList.remove(j - 1);
        }


        System.out.println(arrayList);

    }
}
