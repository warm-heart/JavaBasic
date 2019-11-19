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


}
