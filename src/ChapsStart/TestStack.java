package ChapsStart;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        Stack stack1 = new Stack(20);

        for(int i = 0; i < 10; i++) stack.push(i);
        for(int i = 10; i < 20; i++) stack1.push(i);
        System.out.println("stack1");
        for(int i = 0; i < 10; i++)
            System.out.print(stack.pop() + " ");
        System.out.println();
        System.out.println("stack2");
        for(int i = 0; i < 10; i++)
            System.out.print(stack1.pop() + " ");

        //stack.stck[3] = 100;
        //stack.tos = 5;
    }
}
