package Abstract;

/**
 * @author wangqianlong
 * @create 2019-08-20 15:14
 */

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }


    @Override
    public String fly() {
        System.out.println("I can fly");
        return name;
    }

    public void eat(){
        //子类重写父类方法
        System.out.println("Dog eat");
        //调用父类方法
        super.eat();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("二哈");
        dog.eat();
        dog.fly();

        Animal animal = new Dog("泰迪");
        animal.eat();
    }
}


