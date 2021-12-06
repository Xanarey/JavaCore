public class ForEach12 {
    public static void main(String[] args) {
        int[] nums = {4,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for(int i : nums) {
            System.out.println("[" + i + "]");
            if(i == 5)
                break;
        }

    }
}
