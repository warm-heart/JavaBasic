package Collections;

import java.util.*;

/**
 * @author wangqianlong
 * @create 2019-09-21 12:59
 */

public class Collections {
    public static void main(String[] args) {
     /*   List<String1> list = new ArrayList<>();
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
        list.forEach(e-> System.out.println(e));*/

     /*   HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("one", "one");


        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry);
        }

        hashMap.forEach((k, v) -> System.out.println(k + ": " + v));*/

        Set<String> strings = new TreeSet<>();
        strings.add("a");
        strings.add("c");
        strings.add("b");
        strings.forEach(e -> System.out.println(e));

    }
}
