package basic;


/**
 * @author wangqianlong
 * @create 2020-03-04 9:41
 */

public class ClassLoad {
    static final int q = 1;
    static int i = 106;
    int e;
    final String CONSTANT = "常量";

    //
    {
        System.out.println(e);
        System.out.println("普通代码块");
    }

    static {
        System.err.println("执行静态块");
        System.out.println(i);
    }

    public static void staticMethod() {
        System.out.println("静态方法");
    }


}
