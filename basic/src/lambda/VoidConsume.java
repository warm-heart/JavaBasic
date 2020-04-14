package lambda;

/**
 * @author wangqianlong
 * @create 2020-04-10 23:09
 */

@FunctionalInterface
public interface VoidConsume<T> {

    void accept(T t);



}
