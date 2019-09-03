package Adapter;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wangqianlong
 * @create 2019-09-01 15:52
 */

public class TwoPlugAdapter implements ThreePlug {


    private GBTwoPlug twoPlug;

    public TwoPlugAdapter(GBTwoPlug twoPlug) {
        this.twoPlug = twoPlug;
    }


    @Override
    public void powerWithThree() {
        twoPlug.powerWithTwo();

    }
}
