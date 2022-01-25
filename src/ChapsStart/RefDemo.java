package ChapsStart;

class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = boxWeight.volume();
        System.out.println("Объем boxWeight равен " + vol);
        System.out.print("Вес boxWeight равен " + boxWeight.weight);

        System.out.println();

        plainbox = boxWeight;
        vol = plainbox.volume();

        System.out.println("Объем plainbox равен " + vol);
        //System.out.print("Вес plainbox равен " + plainbox.weight);

    }
}
