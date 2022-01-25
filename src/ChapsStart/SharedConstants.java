package ChapsStart;

import java.util.Random;

interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

class Question implements SharedConstants {
    Random rand = new Random();

    int ask() {
        int prob = (int)(100 * rand.nextDouble());
        if(prob < 30)
            return NO;
        else if(prob < 60)
            return YES;
        else if(prob < 75)
            return MAYBE;
        else if(prob < 85)
            return LATER;
        else if(prob < 98)
            return SOON;
        else
            return NEVER;
    }
}

class AskMe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO -> System.out.println("NO");
            case YES -> System.out.println("YES");
            case MAYBE -> System.out.println("MAYBE");
            case LATER -> System.out.println("LATER");
            case SOON -> System.out.println("SOON");
            case NEVER -> System.out.println("NEVER");
        }
    }

    public static void main(String[] args) {
        Question question = new Question();
        answer(question.ask());
    }
}