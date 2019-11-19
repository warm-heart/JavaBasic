package basic;

/**
 * @author wangqianlong
 * @create 2019-11-12 20:14
 */

public class Cat extends Animal {
    private Integer leg;

    private String desc;


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Cat(String name, String color, Integer leg) {

        super(name, color);
        //super和this（）不能同时出现两个语句均要在第一句
        //this();

        desc = "Cat";
        this.leg = leg;
        //根据不同输出实例的地址
        System.out.println(this);
        System.out.println(name);
    }

    public Cat() {
    }

    public void eat() {
        //子类不能访问父类private修饰的变量与方法
        //父子类中同名变量可以用super区别
        //System.out.println(desc);
        // System.out.println(super.desc);

    }

    public static void main(String[] args) {
        Cat cat = new Cat("kiki", "red", 4);
        cat.eat();

        System.out.println("cat getDesc:" + cat.getDesc());

        Animal animal = new Animal();
        System.out.println("animal getDesc:" + animal.getDesc());


    }

}
