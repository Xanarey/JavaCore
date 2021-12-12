interface IntStack {
    void push(int item);
    int pop();
}

class FixedStack implements IntStack {

    private int[] stck;
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if(tos == stck.length - 1)
            System.out.println("Stack overflow");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if(tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class IFTest {
    public static void main(String[] args) {
        FixedStack fixedStack1 = new FixedStack(10);
        FixedStack fixedStack2 = new FixedStack(20);

        for(int i = 0; i < 10; i++) fixedStack1.push(i);
        for(int i = 0; i < 20; i++) fixedStack2.push(i);

        for(int i = 0; i < 10; i++) System.out.println(fixedStack1.pop());
        for(int i = 0; i < 20; i++) System.out.println(fixedStack2.pop());
    }
}

class DynStack implements IntStack {

    private int[] stck;
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if(tos == stck.length - 1) {
            int[] temp = new int[stck.length * 2];

            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }

    public int pop() {
        if(tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;

        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds;

        for(int i = 0; i < 12; i++) mystack.push(i);

        mystack = fs;

        for(int i = 0; i < 8; i++) mystack.push(i);

        mystack = ds;

        System.out.println("Значения в динамическом стеке: ");
        for(int i = 0; i < 12; i++)
            System.out.println(mystack.pop());

        mystack = fs;

        System.out.println("Значения в статическом стеке: ");
        for(int i = 0; i < 8; i++)
            System.out.println(mystack.pop());
    }
}