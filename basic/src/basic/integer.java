package basic;

/**
 * @author wangqianlong
 * @create 2019-11-06 15:35
 */

public class integer {
    public static void main(String[] args) {
        Integer q=1;
        Integer w =new Integer(200);
        Integer e = Integer.valueOf(1);
        System.out.println(q==w);
        System.out.println(q==e);  //小于127为true
        System.out.println(w==e);

        int r=1;
        System.out.println(r==q);
    }
}
