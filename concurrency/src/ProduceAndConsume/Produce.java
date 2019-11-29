package ProduceAndConsume;

import java.util.ArrayList;


/**
 * @author wangqianlong
 * @create 2019-11-27 19:28
 */

public class Produce implements Runnable {


    ArrayList<String> container;
    String produce;
    public static final int max = 5;

    public Produce(ArrayList<String> container, String produce) {
        this.container = container;
        this.produce = produce;
    }

    @Override
    public void run() {

        synchronized (container) {
            while (container.size() >= max) {
                try {
                    System.out.println("容器已满，请等待");
                    container.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            container.add(produce);
            System.out.println("添加" + produce);
            container.notifyAll();
        }


    }
}
