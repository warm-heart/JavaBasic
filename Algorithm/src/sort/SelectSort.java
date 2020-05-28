package sort;

/**
 * @author wangqianlong
 * @create 2020-04-30 12:21
 */

public class SelectSort {


    public static void selectSort(int s[]) {

        for (int i = 0; i < s.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j] < s[minIndex])
                    minIndex = j;
            }
            if (i != minIndex) {
                swap(i,minIndex,s);
//                int temp = s[i];
//                s[i] = s[minIndex];
//                s[minIndex] = temp;
            }
        }
    }

    public static void swap(int one, int two, int[] values) {
        int temp = values[one];
        values[one] = values[two];
        values[two] = temp;
    }

    public static void main(String[] args) {
        int s[] = new int[]{8, 6, 2, 3, 1, 5, 7, 4,4};
        selectSort(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }


}
