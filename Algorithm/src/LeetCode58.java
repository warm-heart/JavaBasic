import java.util.Arrays;

/**
 * @author wangqianlong
 * @create 2019-11-25 11:18
 */

public class LeetCode58 {

    public int lengthOfLastWord(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int lastEmptyIndex =s.lastIndexOf(" ");

        return s.length()-1-lastEmptyIndex;

    }

    public static void main(String[] args) {
        String s = "a";
        LeetCode58 code58 = new LeetCode58();

        System.out.println(code58.lengthOfLastWord(s));

    }
}
