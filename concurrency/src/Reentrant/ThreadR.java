package Reentrant;

/**
 * @author wangqianlong
 * @create 2019-08-22 15:12
 */

public class ThreadR implements Runnable {
    private ReentrantDemo reentrantDemo;

    public ThreadR(ReentrantDemo reentrantDemo) {
        this.reentrantDemo = reentrantDemo;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reentrantDemo.get();
    }
}
