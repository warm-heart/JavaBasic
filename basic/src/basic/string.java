package basic;

import java.util.Arrays;

/**
 * @author wangqianlong
 * @create 2019-11-03 11:06
 */

public class string {
    public static void main(String[] args) {
        //两个字符串拼接和另一个字符串是true  其余全为false
        String s = "hello";
        String s1 = new String("hello");
        String s2 = "he" + "llo";

        String s3 = "he";
        String s4 = s3 + "llo";

        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s2 == s1);
        System.out.println(s==s4);

    }
}
