package Pool;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @author wangqianlong
 * @create 2019-08-13 9:31
 *
 * 线程池处理list任务
 */

public class ThreadPoolDealListTest {
    public static void main(String[] args) throws InterruptedException {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            stringList.add("list任务" + i);
        }

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < stringList.size(); i++) {
            DealList dealList = new DealList(stringList.get(i));
            service.execute(dealList);
        }
    }
}
