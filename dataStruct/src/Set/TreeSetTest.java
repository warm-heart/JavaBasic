package Set;


import java.util.*;

/**
 * @author wangqianlong
 * @create 2019-09-01 9:12
 */

public class TreeSetTest {
    public static void main(String[] args) {

        People people = new People("wang", 16);
        People people1 = new People("a", 15);
        People people2 = new People("b", 18);


        Set<People> set = new TreeSet<>();

        set.add(people);
        set.add(people1);
        set.add(people2);


        Iterator<People> iterator = set.iterator();


        while (iterator.hasNext()) {

            People people3 = iterator.next();
            if (people3.getName().equals("a")) {
                iterator.remove();
            }
        }


        System.out.println(set);


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
