package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangqianlong
 * @create 2019-11-06 15:35
 */

/*
*
*  int 与Integer定义的变量比较。，由于Java的自动拆箱和装箱机制会比较会是数值
*
*  Integer与Integer.valueOf在127及一下会相等，其余情况全不相等
*
*
* */

public class integer {
    public static void main(String[] args) {
        Integer q=1;
        Integer w =new Integer(1);
        Integer e = Integer.valueOf(1);
        System.out.println(q==w);
        System.out.println(q==e);  //小于127为true
        System.out.println(w==e);


        int r=1;
        System.out.println(r==q);
        System.out.println(r==w);

     

    }
}
