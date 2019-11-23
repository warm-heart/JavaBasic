/**
 * @author wangqianlong
 * @create 2019-11-23 14:56
 */

public class LeetCode509 {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        return f(N);
    }

    public int f(int n) {

        if (n == 1 || n == 2)
            return 1;
        else
            return f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {
        LeetCode509 code509 = new LeetCode509();
        int result = code509.fib(0);
        System.out.println(result);
    }
}
