package Reentrant;

/**
 * @author wangqianlong
 * @create 2019-08-22 15:12
 */

public class ReentrantTest {
    public static void main(String[] args) {

        ReentrantDemo reentrantDemo = new ReentrantDemo();
        ThreadR threadR=new ThreadR(reentrantDemo);
        for (int i = 0; i < 10; i++) {
            new Thread(threadR, String.valueOf(i)).start();
        }

    }
}
