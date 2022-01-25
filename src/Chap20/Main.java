package Chap20;

public class Main {

    public static void main(String[] args) {

        Body body = new Body();
        Leg leg = new Leg();

        SmallHead sh = new SmallHead();
        BigHead bg = new BigHead();
        MediumHead mh = new MediumHead();

        Robot<SmallHead> robot = new Robot<SmallHead>(body, sh);
        Robot<BigHead> robot1 = new Robot<BigHead>(body, bg);

        robot.getHead().burn();
        robot1.getHead().turn();
    }

}

class Robot <T extends Head> {
    private Body body;
    private T head;


    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public T getHead() {
        return head;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setHead(T head) {
        this.head = head;
    }
}

class Body {

}

class Head {

}

class Leg {

}

class SmallHead extends Head {
    public void burn() {
        System.out.println("burn");
    }
}

class MediumHead extends Head {
    public void say() {
        System.out.println("say");
    }
}

class BigHead extends Head {
    public void turn() {
        System.out.println("turn");
    }
}
