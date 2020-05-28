import java.util.Arrays;
import java.util.HashMap;


/**
 * @author wangqianlong
 * @create 2019-11-23 16:44
 */

public class LeetCode500 {

    public String[] findWords(String[] words) {


        String[] result = new String[words.length];
        HashMap map = new HashMap();
        map.put("q", "q");
        map.put("w", "w");
        map.put("e", "e");
        map.put("r", "t");
        map.put("t", "t");
        map.put("y", "y");
        map.put("u", "u");
        map.put("i", "i");
        map.put("o", "o");
        map.put("p", "p");

        HashMap map1 = new HashMap();
        map1.put("a", "a");
        map1.put("s", "s");
        map1.put("d", "f");
        map1.put("f", "f");
        map1.put("g", "g");
        map1.put("h", "h");
        map1.put("j", "j");
        map1.put("k", "k");
        map1.put("l", "l");
        HashMap map2 = new HashMap();
        map2.put("z", "z");
        map2.put("x", "x");
        map2.put("c", "c");
        map2.put("v", "v");
        map2.put("b", "b");
        map2.put("n", "n");
        map2.put("m", "m");

        int m = 0;
        for (int i = 0; i < words.length; i++) {

            if (isSuccess(map, words[i]) || isSuccess(map1, words[i]) || isSuccess(map2, words[i])) {
                result[m] = words[i];
                m++;
            }

        }

        return Arrays.copyOf(result, m);
    }

    public boolean isSuccess(HashMap<String, String> map, String source) {
        boolean isSuccess = true;
        char c[] = source.toCharArray();
        for (int i = 0; i < c.length; i++) {
            String s = String.valueOf(c[i]).toLowerCase();
            if (!map.containsKey(s)) {
                isSuccess = false;
                break;
            }
        }
        return isSuccess;
    }

    public static void main(String[] args) {
        String words[] = {"asdfghjkl","qwertyuiop","zxcvbnm"};
        LeetCode500 code500 = new LeetCode500();
        System.out.println(Arrays.toString(code500.findWords(words)));
    }
}
