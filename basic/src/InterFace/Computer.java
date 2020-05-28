package InterFace;

/**
 * @author wangqianlong
 * @create 2019-08-20 15:35
 */

public  interface Computer {
    String name = "ad";


    static void print() {
        System.out.println("static修饰的方法");
    }

    default void print1() {
        System.out.println("default修饰的方法");
    }

    void print2();


}
