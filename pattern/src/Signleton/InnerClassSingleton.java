package Signleton;



/**
 * @author wangqianlong
 * @create 2020-04-05 13:18
 */

public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    InnerClassSingleton getInnerClassSingleton() {
        return InnerClassHolerd.singleton;
    }

    private static class InnerClassHolerd {

         static InnerClassSingleton singleton = new InnerClassSingleton();
    }

}
