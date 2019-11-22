

/**
 * @author wangqianlong
 * @create 2019-09-21 11:40
 */

public class stringReverse {
    public static void main(String[] args) {
        String s = "hello";
        char[] c = s.toCharArray();
        StringBuilder builder = new StringBuilder();


        for (int i = c.length - 1; i >= 0; i--) {
            builder.append(c[i]);
            System.out.println(c[i]);

        }
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}
