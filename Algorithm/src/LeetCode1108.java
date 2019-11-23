/**
 * @author wangqianlong
 * @create 2019-11-23 14:35
 */

public class LeetCode1108 {

    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        char[] chars = address.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                builder.append("[.]");
            } else
                builder.append(chars[i]);
        }
        String result = builder.toString();
        return result;
    }

    public static void main(String[] args) {
        LeetCode1108 code1108 = new LeetCode1108();
        System.out.println(code1108.defangIPaddr("1.1.1.1"));
    }
}
