package basic;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

/**
 * @author wangqianlong
 * @create 2020-03-04 9:41
 */

public class ClassLoad {
    static int i = 106;

    static {
        System.out.println(i);
        System.out.println("初始化");
    }


    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoad classLoad = new ClassLoad();
        System.out.println(classLoad.i);
    }
}
