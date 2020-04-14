package Abstract;

/**
 * @author wangqianlong
 * @create 2020-04-11 22:22
 */

public class Son extends Father {

    @Override
    public void afterAccess() {
        System.out.println("son afterAccess");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.play();

        /*Father father = new Father();
        father.play();*/
    }
}
