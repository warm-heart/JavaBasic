package Set;

/**
 * @author wangqianlong
 * @create 2019-04-21 14:46
 */

public class People implements Comparable<People> {

    private String name;
    // static String age ="18";
    private Integer age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int hashCode() {
        int B = 31;
        int hash = 0;
        hash = hash * B + name.hashCode();
        hash = hash * B + age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        People another = (People) obj;
        return this.name.equals(another.name) && this.age == another.age;
    }


    @Override
    public int compareTo(People o) {
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
