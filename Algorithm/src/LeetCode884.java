import java.util.*;

/**
 * @author wangqianlong
 * @create 2019-11-28 16:57
 */

public class LeetCode884 {

    public String[] uncommonFromSentences(String A, String B) {
        A.trim();
        B.trim();
        String a[] = A.split(" ");
        String b[] = B.split(" ");


        List<String> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            putinMap(map, a[i]);
        }
        for (int j = 0; j < b.length; j++) {
            putinMap(map, b[j]);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }

        }

        String res[] = result.toArray(new String[0]);

        return res;

    }


    public void putinMap(HashMap<String, Integer> map, String target) {
        if (map.containsKey(target)) {
            map.put(target, map.get(target) + 1);
        } else map.put(target, 1);
    }

    public static void main(String[] args) {
        LeetCode884 code884 = new LeetCode884();
        String result[] = code884.uncommonFromSentences("apple apple", "banana");
        System.out.println(Arrays.toString(result));
    }
}
