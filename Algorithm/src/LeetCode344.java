/**
 * @author wangqianlong
 * @create 2019-11-23 15:14
 */

public class LeetCode344 {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char a = s[j];
            s[j] = s[i];
            s[i] = a;
            j--;
            i++;
        }
        for (int k = 0; k < s.length; k++) {
            System.out.println(s[k]);
        }
    }

    public static void main(String[] args) {
        char s[] = {'h', 'e', 'l', 'l', 'o'};
        LeetCode344 code344 = new LeetCode344();
        code344.reverseString(s);
    }
}
