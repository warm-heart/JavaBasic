package Abstract;

/**
 * @author wangqianlong
 * @create 2019-08-20 15:11
 */

public abstract class Animal {

    String name;
    Integer age;

    private String color;
    String desc;
    String father = "father中变量";

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String color) {
        desc = "Animal";
        this.name = name;
        this.color = color;
    }

    public Animal() {
        desc = "Animal";
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
