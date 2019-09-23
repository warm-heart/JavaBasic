package lock;

import java.util.concurrent.CountDownLatch;

/**
 * @author wangqianlong
 * @create 2019-09-22 21:16
 */

public class Count {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(1);

        //打印顺序
        // 1.主线程开始阻塞
        //2.子线程开始运行
        //3.主线程阻塞结束
        //子线程运行结束
        //可见  countDownLatch.countDown()方法把计数器减为0，在countDownLatch.await()的线程结束阻塞状态，等待cpu调度

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程开始运行");
                try {
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();

                try {
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("子线程运行结束");
            }
        }).start();


        System.out.println("主线程开始阻塞");
        countDownLatch.await();
        System.out.println("主线程阻塞结束");


    }

}
