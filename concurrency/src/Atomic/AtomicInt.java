package Atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wangqianlong
 * @create 2019-08-22 14:16
 */

public class AtomicInt {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        boolean a = atomicInteger.compareAndSet(0, 2);
        System.out.println(a);
    }
}
