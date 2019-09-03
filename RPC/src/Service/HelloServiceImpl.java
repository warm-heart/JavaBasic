package Service;

/**
 * @author wangqianlong
 * @create 2019-08-15 20:46
 */

public class HelloServiceImpl implements  HelloService{
    @Override
    public String sayHello() {
        return "Hello RPC";
    }
}
