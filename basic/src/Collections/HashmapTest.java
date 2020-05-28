package Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangqianlong
 * @create 2020-04-24 16:22
 */

public class HashmapTest {
    public static void main(String[] args) {


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("one", "one");


        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry);
        }

        hashMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
