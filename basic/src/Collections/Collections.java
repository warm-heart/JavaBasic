package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author wangqianlong
 * @create 2019-09-21 12:59
 */

public class Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("s");
        list.add("d");

        java.util.Collections.sort(list);
        System.out.println(list);
        List list1 = java.util.Collections.unmodifiableList(list);
        System.out.println(list1);
        list.add("g");
        System.out.println(list1);

        List list2 = java.util.Collections.synchronizedList(list);
        list2.add("k");

        System.out.println(list1);

    }
}
