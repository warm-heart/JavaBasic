package Signleton;

/**
 * @author wangqianlong
 * @create 2020-04-10 22:48
 *
 *
 *
 * 以外的单例模式都可以通过反射破坏构造函数的私有性和序列化 破坏单例
 */

public enum EnumSingleton {
    INSTANCE;

    int age;

    public void method() {
        System.out.println("method");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EnumSingleton{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        System.out.println(singleton);
        singleton.setAge(4);
        System.out.println(singleton.getAge());

    }

}
