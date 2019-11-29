import java.util.*;

/**
 * @author wangqianlong
 * @create 2019-11-24 11:05
 */

public class LeetCode1200 {


    public List<List<Integer>> minimumAbsDifference(int[] arr) {

         Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();

        int min = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            int res = arr[i + 1] - arr[i];
            if (res <= min) {
                min = res;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {

            int res = arr[i + 1] - arr[i];
            if (res == min) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return result;
    }


    public static void main(String[] args) {
        LeetCode1200 code1200 = new LeetCode1200();
        int s[] = {-57, -70, 6, -69, 5, -47, -13};
        System.out.println(code1200.minimumAbsDifference(s));

    }


}
