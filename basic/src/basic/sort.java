package basic;

import java.util.*;

/**
 * @author wangqianlong
 * @create 2019-11-06 15:37
 */

public class sort {
    public static void main(String[] args) {


      /*  Integer [] s = {1,9,45,57,7};
        Arrays.sort(s);
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }*/

      

        ArrayList<Animal> list = new ArrayList();
        Animal animal = new Animal("first", "red");
        list.add(animal);
        ArrayList<Animal> list1 = (ArrayList<Animal>) list.clone();
        System.out.println("修改前");
        System.out.println(list);
        System.out.println(list1);

        Animal animal1 = new Animal("next", "red");
        list1.set(0, animal1);
        System.out.println("修改后");
        System.out.println(list);
        System.out.println(list1);

    }

}
