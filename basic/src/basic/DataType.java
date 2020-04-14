package basic;

import java.math.BigDecimal;

/**
 * @author wangqianlong
 * @create 2020-04-09 13:53
 */

public class DataType {

    /*整型 start*/

    //取值10000000（-128）到 01111111（127），变量初始化默认值为0，包装类Byte
    byte q = 124;

    //长度为2字节16bit，取值10000000 00000000（-32768）到 01111111 11111111（32767）
    // 变量初始化默认值为0，包装类Short
    short w = (short) 327609;  //溢出 结果为 -71

    //取值-2^31 （-2,147,483,648）到 2^31-1（2,147,483,647），变量初始化默认值为0，包装类Integer
    int e = 1;

    //取值-2^63 （-9,223,372,036,854,775,808‬）到 2^63-1（9,223,372,036,854,775,8087），
    // 变量初始化默认值为0或0L，包装类Long
    long r = 16L;

    /* 整型 end*/

    /*浮点型 start*/

    //单精度浮点数 8位有效数字（小数点前后数字总数）
    float t = 1.32344435f;

    //双精度浮点数
    double y = 3.1d;

    /*浮点型 end*/

    //字符型
    char u = 'd';

    //布尔型
    boolean i = true;

    public void print() {
        System.out.println("byte:  " + q);
        System.out.println("short:  " + w);
        System.out.println("int:  " + e);
        System.out.println("long:  " + r);
        System.out.println("float:  " + t);
        System.out.println("double:  " + y);
        System.out.println("char:  " + u);
        System.out.println("boolean:  " + i);

        System.out.println();
        System.out.println();


        //也就是说一个数*2永远不可能消灭小数部分，这样算法将无限下去。
        // 很显然，小数的二进制表示有时是不可能精确的 。
        // 其实道理很简单，十进制系统中能不能准确表示出1/3呢？同样二进制系统也无法准确表示1/10。
        // 这也就解释了为什么浮点型减法出现了"减不尽"的精度丢失问题。

        //如果经过*2能消除小数部分 则精度不会损失（不限次数的*2）
        boolean f = 3 * 0.1 == 0.3;
        System.out.println("3*0.1==0.3:  " + f);

        System.out.println(3 * 0.1);//0.30000000000000004  精度损失

    }

    public static void main(String[] args) throws InterruptedException {
        DataType dataType = new DataType();
        dataType.print();
        BigDecimal bigDecimal = new BigDecimal("3");
        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        System.out.println("BigDecimal乘法:"+bigDecimal.multiply(bigDecimal1));

        BigDecimal res = bigDecimal.divide(bigDecimal1,2,BigDecimal.ROUND_UP);
        System.out.println("BigDecimal除法:"+res);



    }
}
