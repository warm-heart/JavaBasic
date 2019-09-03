package client;


import Service.HelloService;

import java.net.InetSocketAddress;

public class ClientTest {
    public static void main(String[] args) throws ClassNotFoundException {
        HelloService helloService = Client.getRemoteProxyObj(
                Class.forName("Service.HelloService"),
                new InetSocketAddress("127.0.0.1", 20001));
        System.out.println(helloService.sayHello()) ;
    }
}
