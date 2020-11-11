package mapper;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author wangqianlong
 * @create 2020-08-15 12:40
 */

public class MapperProxy implements InvocationHandler {

    Object newInstance(Class clazz) {
        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println(method);
        Annotation[] annotations = method.getAnnotations();
        Arrays.stream(args).forEach(e -> System.err.println(e));
        Class c = method.getReturnType();
        return null;
    }

    public static void main(String[] args) {
        MapperProxy mapperProxy = new MapperProxy();
        UserMapper userMapper = (UserMapper) mapperProxy.newInstance(UserMapper.class);
        userMapper.add("ooo");
    }
}
