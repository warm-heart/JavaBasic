package sort;

/**
 * @author wangqianlong
 * @create 2020-08-27 20:51
 */

public class test {


    public static int c(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int x = nums[j] - nums[i];
                if (x > res)
                    res = x;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(c(new int[]{100,1,30,2,4}));
    }
}
