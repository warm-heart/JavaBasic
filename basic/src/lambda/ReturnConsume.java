package lambda;

/**
 * @author wangqianlong
 * @create 2020-04-10 23:12
 */
@FunctionalInterface
public interface ReturnConsume<T,R> {

    R apply(T t);
}
