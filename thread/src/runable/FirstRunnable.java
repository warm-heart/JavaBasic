package runable;

/**
 * @author wangqianlong
 * @create 2018-11-05 16:37
 */

public class FirstRunnable implements Runnable {
    public FirstRunnable() {
    }

    public FirstRunnable(String name) {
        Thread.currentThread().setName(name);
    }


    public void run() {
        System.out.println("It is First Runnable");
    }
}
