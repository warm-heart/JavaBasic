package basic;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author wangqianlong
 * @create 2020-04-17 10:45
 */

public class WeakRef {
    public static void main(String[] args) throws InterruptedException {
        String  s=new String("12");
       // WeakReference<String> stringWeakReference = new WeakReference<>(s);
        SoftReference<String> softReference=new SoftReference<>(s);
        System.out.println(s); //12
       // System.out.println(stringWeakReference.get()); //12
        System.out.println(softReference.get());
        s=null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(s);//null
       // System.out.println(stringWeakReference.get());//null
        System.out.println(softReference.get());

    }
}
