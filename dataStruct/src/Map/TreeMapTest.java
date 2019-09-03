package Map;



import java.util.TreeMap;

/**
 * @author wangqianlong
 * @create 2019-09-01 9:53
 */

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<People1, String> map = new TreeMap<>();


        People1 people = new People1("wang", 16);
        People1 people1 = new People1("wang", 15);
        People1 people2 = new People1("wang", 18);


        map.put(people, "1");
        map.put(people1, "4");
        map.put(people2, "2");
        System.out.println(map);
    }
}
