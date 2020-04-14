package basic;

/**
 * @author wangqianlong
 * @create 2020-04-10 22:50
 */

public enum Enum {

    FIRST(4,"第一个实例"),
    SECOND(7,"第二个实例"),
    ;
    int age;
    String name;

    Enum(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Enum{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Enum first = Enum.FIRST;
        Enum second = Enum.SECOND;
        System.out.println(first);
        System.out.println(second);
        first.setAge(10);
        System.out.println(first);

    }
}
