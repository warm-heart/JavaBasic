import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangqianlong
 * @create 2019-11-28 19:49
 */

public class test {
    public static void solution() {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (in.hasNextInt()) {
            int a = in.nextInt();
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(count(list.get(i)));
        }
    }

    public static int count(int target) {
        int count = 0;
        int da=0;
        int end = target / 2;

        for (int i = 2; i <=end; i++) {
            int y = target - i;
            if (isSu(y) && isSu(i)) {
                count++;
            }
        }
        return count ;
    }

    public static boolean isSu(int x) {
        boolean flag = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        solution();
    }
}
