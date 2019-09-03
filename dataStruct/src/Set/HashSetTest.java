package Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wangqianlong
 * @create 2019-05-06 15:33
 */

public class HashSetTest {
    public static void main(String[] args) {

        People people = new People("wang",10);
        People people1 = new People("wang",11);
        People people2 = new People("wang",12);

        Set<People> set = new HashSet();
        set.add(people);
        set.add(people1);
        set.add(people2);
        set.add(people1);

        System.out.println(set.size());
        Iterator<People> studentIterator = set.iterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
    }
}
