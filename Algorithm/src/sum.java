import java.util.*;

/**
 * @author wangqianlong
 * @create 2019-06-12 10:43
 */

public class sum {

    public List<int[]> twoSum(int[] nums, int target) {
        List res = new ArrayList();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int f = 7 / 2 + 1;
        for (int i = 0; i < f; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                res.add(new int[]{nums[i], nums[map.get(target - nums[i])]});
            }
        }
        if (res.isEmpty())
            res.add(new int[]{-1, -1});
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,9,10,13};
        sum twoSum = new sum();

        List<int[]> res = twoSum.twoSum(nums, 23);

        for (int i = 0; i < res.size(); i++) {
            System.out.println(Arrays.toString(res.get(i)));
        }
    }
}
