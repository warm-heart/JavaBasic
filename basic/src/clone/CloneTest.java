package clone;

import java.io.IOException;

/**
 * @author wangqianlong
 * @create 2019-09-03 9:58
 */

public class CloneTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        AnimalHome animalHome = new AnimalHome("四川");
        Animal animal = new Animal("动物", 3, animalHome);
        System.out.println(animal.getHome().hashCode());

        Animal animal1 = (Animal) animal.deepClone();
        animal1.getHome().setLocate("成都");
        System.out.println(animal);
        System.out.println(animal1.getHome().hashCode());


    }
}
