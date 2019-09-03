package clone;

import java.io.*;

/**
 * @author wangqianlong
 * @create 2019-09-03 9:56
 */

public class Animal implements Cloneable ,Serializable{
    private String type;
    private Integer age;
    private AnimalHome home;
    @Override
    protected Object clone() throws CloneNotSupportedException {
      /*  Animal animal = (Animal) super.clone();
        animal.home = (AnimalHome) home.clone();
        return animal;*/
      return super.clone();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        //序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


    public Animal(String type, Integer age, AnimalHome home) {
        this.type = type;
        this.age = age;
        this.home = home;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AnimalHome getHome() {
        return home;
    }

    public void setHome(AnimalHome home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", home=" + home +
                '}';
    }
}
