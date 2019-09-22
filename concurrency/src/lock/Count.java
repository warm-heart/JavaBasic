package lock;

import java.util.concurrent.CountDownLatch;

/**
 * @author wangqianlong
 * @create 2019-09-22 21:16
 */

public class Count {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(1);


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

               /* try {
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                System.out.println("子线程运行结束");
            }
        }).start();


        System.out.println("主线程开始阻塞");
        countDownLatch.await();
        System.out.println("主线程阻塞结束");


    }

}
