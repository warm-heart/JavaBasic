/**
 * @author wangqianlong
 * @create 2019-11-29 12:28
 */

public class LeetCode1184 {


    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum = 0;
        int sum1 = 0;

        if (start > destination) {
            int a = start;
            start = destination;
            destination = a;

        }
        for (int i = 0; i < distance.length; i++) {
            sum += distance[i];
        }

        for (int i = start; i < destination; i++) {
            sum1 += distance[i];
        }

        return Math.min(sum1, sum - sum1);
    }

    public static void main(String[] args) {

        LeetCode1184 code1184 = new LeetCode1184();

        int distance[] = {7, 10, 1, 12, 11, 14, 5, 0};
        int start = 7, destination = 2;
        System.out.println(code1184.distanceBetweenBusStops(distance, start, destination));

    }
}
