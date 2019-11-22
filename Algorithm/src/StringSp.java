/**
 * @author wangqianlong
 * @create 2019-11-18 9:39
 */

public class StringSp {
    public static void main(String[] args) {
        String S1 = "asdjkl";
        String S2 = "ajl";
        char[] c1 = S1.toCharArray();
        char[] c2 = S2.toCharArray();

        boolean success = true;
        int index = 0;
        for (int i = 0; i < c2.length; i++) {
            for (int j = 0; j < c1.length; j++) {
                if (c2[i] == c1[j]) {
                    index = j;
                    success = j >= index ? true : false;
                }
            }
        }

    }
}
