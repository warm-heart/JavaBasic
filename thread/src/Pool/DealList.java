package Pool;


/**
 * @author wangqianlong
 * @create 2019-08-13 9:45
 */

public class DealList implements Runnable {
    BusinessnsService businessnsService;
    String data;

    public DealList(BusinessnsService businessnsService, String data) {
        this.businessnsService = businessnsService;
        this.data = data;
    }


    @Override
    public void run() {
        //System.out.print("当前线程" + Thread.currentThread().getName() + "处理：" +data);
        businessnsService.handle(data);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
