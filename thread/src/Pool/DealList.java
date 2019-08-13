package Pool;



/**
 * @author wangqianlong
 * @create 2019-08-13 9:45
 */

public class DealList implements Runnable {
    String data;

    public DealList(String data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("当前线程"+Thread.currentThread().getName()+"处理："+data);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
