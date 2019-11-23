/**
 * @author wangqianlong
 * @create 2019-11-23 14:30
 */

public class LeetCodeLcp1 {

    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCodeLcp1 codeLcp1 = new LeetCodeLcp1();
        int guess[] = {2, 2, 3};
        int answer[] = {3, 2, 1};
        System.out.println(codeLcp1.game(guess, answer));
    }
}
