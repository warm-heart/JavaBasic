package lock;

/**
 * @author wangqianlong
 * @create 2019-09-18 17:03
 */

public class waitTest {
    public static void main(String[] args) throws InterruptedException {

        String s = new String("hello");
   /*     synchronized (s) {
            s.wait();
            s = "da";
            System.out.println(s);
        }

        synchronized (s){
            s.notifyAll();
        }
        System.out.println(s);*/
        s.notifyAll();
    }
}
