package Collections;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

/**
 * @author wangqianlong
 * @create 2020-04-24 16:21
 */

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("s");
        list.add("s");
        list.add("d");
        list.add("d");
//        java.util.Collections.sort(list);
//        System.out.println(list);
//        List list1 = java.util.Collections.unmodifiableList(list);
//        System.out.println(list1);
//        list.add("g");
//        System.out.println(list1);
//
//
//        List list2 = java.util.Collections.synchronizedList(list);
//        list2.add("k");
//
//
//        list.forEach(e -> System.out.println(e));
//        ListIterator listIterator = list.listIterator();
//        while (listIterator.hasNext()) {
//            listIterator.add("j");
//        }

        List list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

    }
}
