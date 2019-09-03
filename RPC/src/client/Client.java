package client;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;


public class Client {
    //获取代表服务端接口的动态代理对象（HelloService）
    //serviceInterface:请求的接口名
    //addr:待请求服务端的ip:端口
    @SuppressWarnings("unchecked")
    public static <T> T getRemoteProxyObj(final Class serviceInterface,
                                          final InetSocketAddress addr) {

        return (T) Proxy.newProxyInstance(serviceInterface.getClassLoader(),
                new Class<?>[]{serviceInterface}, new InvocationHandler() {

                    //proxy:代理的对象, method：哪个方法（sayHello(参数列表)）, args:参数列表
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args)
                            throws Throwable {
                        //客户端向服务端发送请求：请求某一个具体的接口
                        Socket socket = new Socket();
                        ObjectOutputStream output = null;
                        ObjectInputStream input = null;
                        try {
                            //socketaddress:  Ip：端口
                            socket.connect(addr);

                            //发送 ：序列化流（对象流）
                            output = new ObjectOutputStream(socket.getOutputStream());
                            //接口名  、 方法名 ：writeUTF
                            output.writeUTF(serviceInterface.getName());
                            output.writeUTF(method.getName());
                            //方法参数的类型、方法参数  Object
                            output.writeObject(method.getParameterTypes());
                            output.writeObject(args);
                            //等待服务端处理...
                            //接收服务端处理后的返回值
                            input = new ObjectInputStream(socket.getInputStream());
                            return input.readObject();//客户端-服务端 ->返回值
                        } catch (Exception e) {
                            e.printStackTrace();
                            return null;
                        } finally {
                            try {
                                System.out.println();
                                if (output != null) output.close();
                                if (input != null) input.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
    }
}
