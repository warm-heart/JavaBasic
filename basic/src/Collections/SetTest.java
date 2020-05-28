package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author wangqianlong
 * @create 2020-04-24 16:22
 */

public class SetTest {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        strings.add("a");
        strings.add("c");
        strings.add("b");
        strings.forEach(e -> System.out.println(e));
        HashSet set = new HashSet();
        set.add(null);
        set.add("name");
        set.add(null);
        set.forEach(e -> System.out.println(e));

        Set<String> stringSet = new HashSet<>(16);
        stringSet.add("a");
        stringSet.add("c");
        stringSet.add("b");
        Iterator iterator = stringSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
