import java.util.HashMap;

/**
 * @author wangqianlong
 * @create 2019-11-24 10:16
 */

public class LeetCode1160 {

    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars1 = chars.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (map.containsKey(chars1[i])) {
                Integer m = map.get(chars1[i]);
                map.put(chars1[i], m + 1);
            } else
                map.put(chars1[i], 1);
        }
        System.out.println(map);
        Integer result = 0;
        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Integer> map1 = (HashMap<Character, Integer>) map.clone();
            if (isOk(map1, words[i])) {
                result += words[i].length();
            }
        }
        return result;
    }

    public boolean isOk(HashMap<Character, Integer> map, String word) {
        char[] chars1 = word.toCharArray();
        boolean ok = true;
        for (int i = 0; i < chars1.length; i++) {
            if (map.containsKey(chars1[i]) && map.get(chars1[i]) != 0) {
                map.put(chars1[i], map.get(chars1[i]) - 1);
            } else {
                ok = false;
                break;
            }
        }
        return ok;
    }


    public static void main(String[] args) {

        LeetCode1160 code1160 = new LeetCode1160();
        String[] strings = {"cat", "bt", "hat", "tree"};
        System.out.println(code1160.countCharacters(strings, "atach"));

    }

}
