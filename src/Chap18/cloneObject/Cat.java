package Chap18.cloneObject;

// Без Serializable - java.io.NotSerializableException

import java.io.*;

public class Cat implements Serializable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class SerializeCar {
    private static final String FILE_NAME = "catTester.ser";

    public static void main(String[] args) {
        serialize();
        Cat cat = deserialize();
        System.out.println(cat.getName());
    }

    private static Cat deserialize() {
        Cat cat = null;
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis)){
            cat = (Cat)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return cat;
    }

    private static void serialize() {
        Cat cat = new Cat("Tom");
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)){
            os.writeObject(cat);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}