package Map;

/**
 * @author wangqianlong
 * @create 2019-04-21 14:46
 */

public class People1 implements Comparable<People1> {

    private String name;
    // static String age ="18";
    private Integer age;

    public People1(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(People1 o) {
        if (this.age > o.age) {
            return 1;
        }
        if (this.age < o.age) {
            return -1;
        }
        if (this.age.equals(o.age)) {
            return this.name.compareTo(o.name);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
