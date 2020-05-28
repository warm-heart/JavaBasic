package sort;

/**
 * @author wangqianlong
 * @create 2019-11-23 13:03
 */

public class BinSearch {

    public int binSearch(int s[], int key) {
        return binSearch0(s, 0, s.length - 1, key);
    }


    public int binSearch0(int s[], int fromIndex, int toIndex, int key) {

        int low = fromIndex;
        int high = toIndex;
        int mid = fromIndex + (toIndex - fromIndex) / 2;
       /* if (low >= high) {
            if (s[low] == key)
                return low;
            return -1;
        }*/
        if (low > high) {
            return -1;
        }
        if (s[mid] == key) {
            return mid;
        }
        if (s[mid] > key) {
            return binSearch0(s, fromIndex, mid - 1, key);
        }
        if (s[mid] < key) {
            return binSearch0(s, mid + 1, toIndex, key);
        }

        return -1;
    }

    public static void main(String[] args) {
        BinSearch binSearch = new BinSearch();
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int s = binSearch.binSearch(a, 0);
        System.out.println(s);

        //不用中间变量交换两个数的值
        int c = 1;
        int b = 2;

        c = c ^ b;
        b = c ^ b;
        c = c ^ b;
        System.out.println(c);
        System.out.println(b);
    }
}
