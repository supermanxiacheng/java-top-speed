package chapter07;

import java.util.ArrayList;

public class Java07_Collection_Generic {
    public static void main(String[] args) {

        // TODO 集合 - Collection
        // 泛型语法
        // TODO 泛型和类型的区别
        // 有时，也把泛型称之为类型参数
        MyContainer<User7> myContainer = new MyContainer();
        //myContainer.data = new Object();

        // 类型存在多态的使用方式，但是泛型没有多态的概念
        test(myContainer);


    }
    public static void test(MyContainer<User7> myContainer) {
        System.out.println(myContainer);
    }
}
// TODO 容器类
class MyContainer<C> {
    public C data;
}
class User7 {

}