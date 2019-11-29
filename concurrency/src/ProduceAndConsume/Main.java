package ProduceAndConsume;

import java.util.*;

/**
 * @author wangqianlong
 * @create 2019-11-27 19:38
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
       /* ArrayList<String> container = new ArrayList<>();
        Produce produce1 = new Produce(container, "1");
        Produce produce2 = new Produce(container, "2");
        Produce produce3 = new Produce(container, "3");
        Produce produce4 = new Produce(container, "4");
        Produce produce5 = new Produce(container, "5");
        Produce produce6 = new Produce(container, "6");
        Produce produce7 = new Produce(container, "7");
        Produce produce8 = new Produce(container, "8");
        Produce produce9 = new Produce(container, "9");
        new Thread(produce1).start();
        new Thread(produce2).start();
        new Thread(produce3).start();
        new Thread(produce4).start();
        new Thread(produce5).start();
        new Thread(produce6).start();
        new Thread(produce7).start();
        new Thread(produce8).start();
        new Thread(produce9).start();


        Thread.sleep(5000);
        System.out.println(container);
        new Thread(new Consumer(container)).start();


        List<Character> list = new ArrayList<>();*/
        StringBuilder builder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int c =Integer.valueOf(a);
        String b =sc.next();
        System.out.println(a);
        System.out.println(b);


    }
}
