package Chap13;

public class InstanceOf2 {
    public static void main(String[] args) {

        Integer x = 25;
        //System.out.println(x instanceof Integer);
        //System.out.println(x instanceof String);

//        Cat cat = new Cat();
//        System.out.println("cat - animal" );
//        System.out.println(cat instanceof Animal);
//        System.out.println("cat - MaineCoon" );
//        System.out.println(cat instanceof MaineCoon);

        Cat cat = new MaineCoon();

        System.out.println("cat - Cat" );
        System.out.println(cat instanceof Cat);
        System.out.println(cat instanceof MaineCoon);


    }
}

class Animal {

}

class Cat extends Animal {

}

class MaineCoon extends Cat {

}