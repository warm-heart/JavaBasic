import java.util.Stack;

/**
 * @author wangqianlong
 * @create 2019-11-25 10:56
 */

public class LeetCode1047 {

    public String removeDuplicates(String S) {
        Stack<Character> characters = new Stack<>();
        char s[] = S.toCharArray();

        for (int i = 0; i < s.length; i++) {
            if (characters.isEmpty() || s[i] != characters.peek()) {
                characters.push(s[i]);
            } else
                characters.pop();
        }
        StringBuilder builder = new StringBuilder();
        for (Character c : characters) {
            builder.append(c);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        LeetCode1047 code1047 = new LeetCode1047();
        System.out.println(code1047.removeDuplicates("abbaca"));
    }
}
