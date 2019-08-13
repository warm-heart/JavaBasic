package Pool;

/**
 * @author wangqianlong
 * @create 2019-08-13 10:43
 */

public class BusinessnsService {

    public void handle(String data) {
        System.out.println(Thread.currentThread().getName() + "业务处理：" + data);
    }
}
