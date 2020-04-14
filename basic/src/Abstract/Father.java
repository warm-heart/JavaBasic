package Abstract;

/**
 * @author wangqianlong
 * @create 2020-04-11 22:22
 */

public class Father {

    public  void play(){

        System.out.println("father play");
        afterAccess();
    }

    public void afterAccess(){
        throw new UnsupportedOperationException();
    }

}
