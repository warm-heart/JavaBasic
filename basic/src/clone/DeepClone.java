package clone;

import java.io.*;

/**
 * @author wangqianlong
 * @create 2020-04-26 17:45
 */

public class DeepClone {

    static void serialize(Animal animal) {
        ObjectOutputStream ous = null;
        try {
            ous = new ObjectOutputStream(new FileOutputStream("E:/user/Animal.txt"));

            ous.writeObject(animal);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ous.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    static Animal deSerialization() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("E:/user/Animal.txt"));
            Animal animal = (Animal) ois.readObject();
            return animal;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static void main(String[] args) {

        Animal animal = new Animal("red", 22);
        serialize(animal);
        Animal animal1 = deSerialization();
        System.out.println(animal1);
        System.out.println(animal == animal1); //false


    }
}

