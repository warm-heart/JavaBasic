package lambda;

/**
 * @author wangqianlong
 * @create 2020-04-10 23:10
 */

public class LambdaTest {
    public static void main(String[] args) {

        String name = "test";

        int age = 3;

        //消费
        VoidConsume voidConsume = e -> System.out.println(e);
        voidConsume.accept(name);

        //返回值

        ReturnConsume<Integer, Integer> integerIntegerReturnConsume = e -> {
            return e + 3;
        };

        Integer res = integerIntegerReturnConsume.apply(age);
        System.out.println(res);


        ReturnConsume<Integer, String> stringReturnConsume = e -> {
            Integer param = new Integer(e);
            Integer result = param + 3;
            return "结果：" + result.toString();
        };

        String s = stringReturnConsume.apply(age);
        System.out.println(s);


        //断言
        PredicateConsume predicateConsume = e -> {
            if (e == 3)
                return true;
            return false;
        };
        boolean flag = predicateConsume.test(age);
        System.out.println(flag);

    }
}
