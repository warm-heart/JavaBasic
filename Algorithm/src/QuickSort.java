import java.util.Arrays;
import java.util.Random;

/**
 * @author wangqianlong
 * @create 2019-11-22 14:43
 */

public class QuickSort {

    public static void QuickSort(int[] s, int left, int right) {
        //递归终止条件 数组为 0，1或者数组本身就是有序的
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int k = s[left];
        while (i < j) {
            while (i < j && s[j] >= k) {
                j--;
            }
            while (i < j && s[i] <= k) {
                i++;
            }
            if (i < j) {
                int temp = s[j];
                s[j] = s[i];
                s[i] = temp;
            }
        }
        s[left] = s[i];
        s[i] = k;
        QuickSort(s, left, i - 1);
        QuickSort(s, i + 1, right);
    }

    public static void main(String[] args) {
        Random random = new Random(10);
        int num[] = new int[100];
        for (int i = 0; i < num.length - 1; i++) {
            num[i] = random.nextInt(1000);
        }

        QuickSort(num, 0, 99);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        Arrays.sort(num);
    }
}
