package Thread;

/**
 * @author wangqianlong
 * @create 2018-11-05 16:32
 */

public class FristThread extends Thread {
    public FristThread() {
    }

    public FristThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (this) {
            super.run();
            System.out.println("初始化");
            notify();
            System.out.println("It is Frist Thread");
        }
    }
}
