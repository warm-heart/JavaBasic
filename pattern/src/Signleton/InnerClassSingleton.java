package Signleton;


/**
 * @author wangqianlong
 * @create 2020-04-05 13:18
 */

public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInnerClassSingleton() {
        return InnerClassHolder.singleton;
    }

    private static class InnerClassHolder {

        static InnerClassSingleton singleton = new InnerClassSingleton();
    }




}
