package Abstract;

/**
 * @author wangqianlong
 * @create 2019-08-20 15:15
 */

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("二哈");
        dog.eat();
        dog.fly();

        Animal animal = new Dog("泰迪");
        animal.eat();
    }
}
