package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangqianlong
 * @create 2020-04-24 16:23
 */

public class ArraysTest {
    public static void main(String[] args) {
        String[] str = new String[]{"you", "me"};

        List list = Arrays.asList(str);
        //list.add("da");//报错

        //正确转化
        List<String> stringList = new ArrayList<>(Arrays.asList(str));
        stringList.add("he");
        stringList.forEach(e-> System.out.println(e));

    }
}
