import java.util.HashMap;
import java.util.Map;

/**
 * @author wangqianlong
 * @create 2019-06-12 10:43
 */

public class twoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])&&map.get(target - nums[i])!=i) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        twoSum twoSum = new twoSum();

        int[] result = twoSum.twoSum(nums, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
