package sort;

/**
 * @author wangqianlong
 * @create 2020-04-30 12:22
 */

public class InsertSort {

    public static void insertSort(int s[]) {
        for (int i = 1; i < s.length ; i++) {
            for (int j = i; j > 0; j--) {
                if (s[j] < s[j - 1]) {
                    int temp = s[j];
                    s[j] = s[j - 1];
                    s[j - 1] = temp;
                } else break;
            }
        }
    }

    public static void main(String[] args) {
        int s [] =new int[]{8,6,2,3,1,5,7,4};
        insertSort(s);
        for (int i = 0; i <s.length ; i++) {
            System.out.print(s[i]);
        }
    }

}
