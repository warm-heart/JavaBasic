package Reentrant;

/**
 * @author wangqianlong
 * @create 2019-08-22 15:10
 */

public class ReentrantDemo {

    public synchronized void set() {
        System.out.println("set");
    }


    public synchronized void get() {

        System.out.println(Thread.currentThread().getName());
        System.out.println("get");
        set();
    }

}
