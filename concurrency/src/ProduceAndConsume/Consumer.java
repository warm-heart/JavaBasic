package ProduceAndConsume;

import java.util.ArrayList;

/**
 * @author wangqianlong
 * @create 2019-11-27 19:35
 */

public class Consumer implements Runnable {

    ArrayList<String> container;
    public static final int max = 5;

    public Consumer(ArrayList<String> container) {
        this.container = container;
    }

    @Override
    public void run() {


        synchronized (container) {
            while (container.isEmpty()) {
                try {
                    container.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("容器为空，请等待");
            }
            String consumer = container.remove(0);
            container.notifyAll();
        }

    }
}
