import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author wangqianlong
 * @create 2019-11-19 19:10
 */

public class ArrayRepeat {

    public static int[] arrUniq(int s[]) {

        int[] tmp = new int[s.length];
        int m = 0;
        for (int i = 0; i < s.length; i++) {
            boolean flag = true;
            for (int j = 0; j < tmp.length; j++) {
                if (s[i] == tmp[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                tmp[m] = s[i];
                m++;
            }
        }
        int[] newArr = new int[m];
        for (int i = 0; i < m; i++) {
            newArr[i] = tmp[i];
        }
        tmp = null;
        return newArr;

    }


    public static void arrUniqWithSet() {
        Integer[] arr = {1, 1, 2, 3, 3};
        Set<Integer> set = new HashSet<>(5);
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        Integer[] newArr = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(newArr));

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3};

        int[] s = arrUniq(arr);
        System.out.println(Arrays.toString(s));
        // arrUniqWithSet();
        int a=Arrays.binarySearch(s,3);

    }

}
