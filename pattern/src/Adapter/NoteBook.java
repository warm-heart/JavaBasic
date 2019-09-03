package Adapter;

/**
 * @author wangqianlong
 * @create 2019-09-01 15:48
 */

public class NoteBook {
    ThreePlug plug;

    public NoteBook(ThreePlug plug) {
        this.plug = plug;
    }

    public void charge(){
        plug.powerWithThree();
    }

    public static void main(String[] args) {

//        GBTwoPlug twoPlug = new GBTwoPlug();
//        ThreePlug threePlug = new TwoPlugAdapter(twoPlug);
//        NoteBook noteBook = new NoteBook(threePlug);
//        noteBook.charge();


        ThreePlug plug = new TwoPlugAdapterByExtends();
        NoteBook noteBook = new NoteBook(plug);
        noteBook.charge();
    }
}
