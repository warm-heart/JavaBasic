package ThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wangqianlong
 * @create 2020-04-16 18:40
 */

public class UserContextHolder {
    User user = new User();
    ThreadLocal<User> userThreadLocal = new ThreadLocal<User>() {
        @Override
        protected User initialValue() {
            //如果返回上面的user 实际上还是共享了一个user实例 依然会发生线程安全问题
            //return user;
            return new User();
        }
    };

    public void test() {
        User user = userThreadLocal.get();
        System.out.println(Thread.currentThread().getName() + "设置前:" + user.getName());
        user.setName(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + "设置后:" + user.getName());
        //添加这一句代码则不会发生ThreadLocal
        //userThreadLocal.remove();
    }


    public static void main(String[] args) throws InterruptedException {
      /*  UserContextHolder contextHolder = new UserContextHolder();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                contextHolder.test();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                contextHolder.test();
            }
        });

        thread.start();
        thread.join();
        thread1.start();*/

        UserContextHolder contextHolder = new UserContextHolder();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            executorService.execute(() -> {

                contextHolder.test();
            });
        }


    }


}
