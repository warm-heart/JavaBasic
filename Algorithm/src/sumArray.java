/**
 * @author wangqianlong
 * @create 2019-11-13 18:40
 */


//递归数组求和
public class sumArray {


    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    //计算arr[l...n]这个区间内所有数字的和
    private static int sum(int[] arr, int i) {
        if (i < arr.length - 1)//返回当前的值 + 剩下的那一部分所有的和
            return arr[i] + sum( arr,i + 1);
        else return arr[i];//只有一个了，所以只需要返回当前的

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(nums));
    }
}
