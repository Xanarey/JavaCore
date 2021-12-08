class BoxWeight extends Box{
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
     }

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }

}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.079);
        double vol;

        vol = mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weight);
        vol = mybox2.volume();
        System.out.println(vol);
        System.out.println(mybox2.weight);
    }
}