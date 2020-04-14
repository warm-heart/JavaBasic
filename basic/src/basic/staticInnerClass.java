package basic;

/**
 * @author wangqianlong
 * @create 2020-04-05 13:08
 */

public class staticInnerClass {
    static int j = 4;

    String name = "test";

    static class staticInner {
        static int i = 1;
        int j = 2;

        static void do1() {


            System.out.println(i);
            System.out.println("内部类调用外部类同名变量j" + staticInnerClass.j);
        }

        void do2() {

            System.out.println("内部类调用同名变量j" + j);
            //非静态方法调用静态变量
            System.out.println("内部类调用外部类同名变量j" + staticInnerClass.j);
        }

    }

    public static void main(String[] args) {
        staticInner staticInner = new staticInnerClass.staticInner();
        staticInner.do2();
        staticInner.do1();

    }

}
