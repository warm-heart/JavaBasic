import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wangqianlong
 * @create 2020-04-12 12:01
 */

public class TwoQueueStack<T> {


    //出队与入队
    Queue<T> queue1 = new LinkedList<>();

    // 工具队列
    Queue<T> queue2 = new LinkedList<>();

    public void enStack(T t) {
        queue1.offer(t);

    }

    public T deStack() {
        //queue1 为空
        if (queue1.isEmpty()) {
            return null;
        }
        //取除队列尾的元素
        int q = queue1.size();
        //非对列尾的元素暂时放进queue2
        for (int i = 0; i < q - 1; i++) {
            queue2.offer(queue1.poll());
        }
        T res = queue1.poll();


        //再把queue2的元素放进queue1
        int p = queue2.size();
        for (int j = 0; j < p; j++) {
            queue1.offer(queue2.poll());

        }
        /*  while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }*/
        return res;
    }

    public static void main(String[] args) {
        TwoQueueStack<Integer> stack = new TwoQueueStack<>();
        stack.enStack(1);
        stack.enStack(2);
        System.out.println("第一次出栈" + stack.deStack());

        stack.enStack(3);
        stack.enStack(4);
        //stack.enStack(5);
        System.out.println("第二次出栈" + stack.deStack());
        System.out.println("第三次出栈" + stack.deStack());
        System.out.println("第四次出栈" + stack.deStack());
        // System.out.println("第五次出栈"+stack.deStack());


    }
}
