package Atomic;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wangqianlong
 * @create 2019-08-22 14:17
 */

public class AtomicRF {
    public static void main(String[] args) {


        AtomicStampedReference<Integer> atomicStampedRef =
                new AtomicStampedReference<>(1, 0);


        Thread main = new Thread(() -> {
            System.out.println("" + Thread.currentThread() + ",初始值 a = " + atomicStampedRef.getReference());
            int stamp = atomicStampedRef.getStamp(); //获取当前标识别
            System.out.println("当前标识1处" + stamp);
            try {
                Thread.sleep(1000); //等待1秒 ，以便让干扰线程执行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(atomicStampedRef.getStamp());
            boolean isCASSuccess = atomicStampedRef.compareAndSet(1, 2, stamp, stamp + 1);  //此时expectedReference未发生改变，但是stamp已经被修改了,所以CAS失败
            System.out.println("" + Thread.currentThread() + ",CAS操作结果: " + isCASSuccess);
        }, "主操作线程");

        Thread other = new Thread(() -> {
            Thread.yield(); // 确保thread-main 优先执行

            atomicStampedRef.compareAndSet(1, 2, atomicStampedRef.getStamp(), atomicStampedRef.getStamp() + 1);
            System.out.println("" + Thread.currentThread() + ",【increment】 ,值 = " + atomicStampedRef.getReference() + "  标识为：" + atomicStampedRef.getStamp());
            atomicStampedRef.compareAndSet(2, 1, atomicStampedRef.getStamp(), atomicStampedRef.getStamp() + 1);
            System.out.println("" + Thread.currentThread() + ",【decrement】 ,值 = " + atomicStampedRef.getReference() + "  标识为：" + atomicStampedRef.getStamp());
        }, "干扰线程");

        main.start();
        other.start();

        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();

    }
}
