package InterFace;

/**
 * @author wangqianlong
 * @create 2019-08-20 15:36
 */

public class ComputerTest {
    public static void main(String[] args) {
        //直接调用static修饰的接口方法
        Computer.print();
        USB usb = new USB();
        //子类调用default修饰的方法
        usb.print1();

        usb.print2();
    }
}
