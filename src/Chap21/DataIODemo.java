package Chap21;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {

        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))) {
            dout.writeDouble(23.4);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Error open file" + e);
            return;
        } catch (IOException e) {
            System.out.println("Error IO" + e);
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("Test.dat"))) {
            double d = dis.readDouble();
            int i = dis.readInt();
            boolean b = dis.readBoolean();
            System.out.println("Value: " + d + " | " + i + " | " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Error open file" + e);
        } catch (IOException e) {
            System.out.println("Error IO" + e);
        }
    }
}
