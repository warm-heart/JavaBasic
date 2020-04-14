import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

/**
 * @author wangqianlong
 * @create 2020-04-12 11:55
 */

public class TwoStackQueue<T> {

    //用来入队
    Stack<T> stack1 = new Stack();
    //用来出队
    Stack<T> stack2 = new Stack();


    public void enQueue(T t) {
        stack1.push(t);
    }

    public T deQueue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                //也可以抛出EmptyStackException
                return null;
            }
            //如果stack1不为空 把数据全部移动到stack2 实现数据的倒置
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        TwoStackQueue<Integer> twoStackQueue = new TwoStackQueue<>();
        twoStackQueue.enQueue(1);
        twoStackQueue.enQueue(2);
        twoStackQueue.enQueue(5);
        System.out.println(twoStackQueue.deQueue());
        twoStackQueue.enQueue(3);
        twoStackQueue.enQueue(4);
        System.out.println(twoStackQueue.deQueue());
        System.out.println(twoStackQueue.deQueue());
        System.out.println(twoStackQueue.deQueue());
        System.out.println(twoStackQueue.deQueue());

    }


}
