public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box(3,4,5);
        Box box1 = new Box(4,5,6);


        double vol;
        vol = box.volume();
        System.out.println(vol);
        vol = box1.volume();
        System.out.println(vol);
    }
}
