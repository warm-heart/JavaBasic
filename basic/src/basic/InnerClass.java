package basic;

/**
 * @author wangqianlong
 * @create 2020-04-05 13:04
 */

public class InnerClass {

    String name = "外部类";
    static String age = "静态的";

    class inner {
        String name = "内部的";

        void print() {

            System.out.println(name);
            System.out.println(age);
            System.out.println(InnerClass.this.name);
            System.out.println("内部类中静态方法");
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        inner inner = innerClass.new inner();
    }
}
