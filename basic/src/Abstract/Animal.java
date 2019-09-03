package Abstract;

/**
 * @author wangqianlong
 * @create 2019-08-20 15:11
 */

public abstract class Animal {

    String name;
    Integer age;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("My name is " + name + "   I can eat");
    }

    protected abstract String fly();

    public String eat(String food) {
        System.out.println("吃具体的食物，方法的重载");
        return food;
    }

}
