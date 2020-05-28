package Jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author wangqianlong
 * @create 2019-04-12 20:56
 */

public class TimeProxy implements InvocationHandler {


    private Object target;

    public TimeProxy(Object target) {
        super();
        this.target = target;
    }


    /**
     * @param proxy  被代理的对象
     * @param method 被代理对象的方法
     * @param args   方法的参数
     * @return 返回object对象
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("汽车开始行驶");

        long startTime = System.currentTimeMillis();
        Object result = method.invoke(target, args);

        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶： " + (endTime - startTime) + "毫秒");
        return result;
        //  return "动态代理返回结果";
    }


    public static void main(String[] args) {
        Car bmw = new Bmw();

        InvocationHandler in = new TimeProxy(bmw);
        Class<?> cls = bmw.getClass();

        Car bus = (Car) Proxy.newProxyInstance(cls.getClassLoader(),
                cls.getInterfaces(), in);

        String result = bus.move("宝马跑起来了");

        System.out.println(result);

        System.out.println(bus.go("参数1", "参数2"));
    }
}
