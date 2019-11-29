package basic;

/**
 * @author wangqianlong
 * @create 2019-11-12 20:14
 */

public class Animal {
    private String name;
    private String color;

     String desc;
     String father="father中变量";



    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Animal(String name, String color) {
        desc="Animal";
        this.name = name;
        this.color = color;
    }

    public Animal() {
        desc="Animal";
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", desc='" + desc + '\'' +
                ", father='" + father + '\'' +
                '}';
    }
}
