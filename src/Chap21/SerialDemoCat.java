package Chap21;

// Без Serializable - java.io.NotSerializableException

import java.io.*;

public class SerialDemoCat implements Serializable {
    private String name;

    public SerialDemoCat(String name) {
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
        SerialDemoCat cat = deserialize();
        System.out.println(cat.getName());
    }

    private static SerialDemoCat deserialize() {
        SerialDemoCat cat = null;
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis)){
            cat = (SerialDemoCat)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return cat;
    }

    private static void serialize() {
        SerialDemoCat cat = new SerialDemoCat("Tom");
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)){
            os.writeObject(cat);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}