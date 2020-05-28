package basic;

import java.io.File;

/**
 * @author wangqianlong
 * @create 2020-04-25 22:10
 */

public class ClassLoadTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {/*
        System.out.println(ClassLoad.q);//调用常量不会进行初始化阶段
        System.out.println(ClassLoad.i);//调用静态变量会进行初始化
        ClassLoad.staticMethod();//调用静态方法进行初始化*/

        /*ClassLoader classLoader =ClassLoad.class.getClassLoader();
        Class c = classLoader.loadClass("basic.ClassLoad");*/

//        ClassLoad classLoad = new ClassLoad();
//
//        ClassLoad classLoad1 = new ClassLoad();
//
//        ClassLoad classLoad2 = new ClassLoad();
        //Class.forName("basic.ClassLoad");

//        Class clazz = ClassLoadTest.class.getClassLoader().loadClass("basic.ClassLoad");
//        ClassLoad classLoad = (ClassLoad) clazz.newInstance();




    }
}
