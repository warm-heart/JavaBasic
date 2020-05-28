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
*  Integer与Integer.valueOf在-128-127会相等，其余情况全不相等
*
*
* */

public class integer {


    public abstract class MyClass {
        public int constInt = 5;

        //add code here
        public void method() {
        }
    }
    public static void main(String[] args) {
        Integer q=127;
        Integer w =new Integer(127);
        Integer e = Integer.valueOf(127);
        System.out.println(q==w);
        System.out.println(q==e);  //小于127为true
        System.out.println(w==e);


        int r=129;
        System.out.println(r==q);
        System.out.println(r==w);

    }
}
