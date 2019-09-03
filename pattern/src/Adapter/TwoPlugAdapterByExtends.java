package Adapter;

/**
 * @author wangqianlong
 * @create 2019-09-01 16:00
 */

public class TwoPlugAdapterByExtends extends GBTwoPlug implements ThreePlug {

    @Override
    public void powerWithThree() {
        System.out.println("通过继承方式");
        powerWithTwo();
    }
}
