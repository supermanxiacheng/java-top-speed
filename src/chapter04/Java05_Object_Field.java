package chapter04;

public class Java05_Object_Field {
    public static void main(String[] args) {

        // TODO 面向对象 - 属性
        // 所谓的属性，其实就是类的对象的相同特征。
        // 语法和变量的声明很像。
        // 属性类型 属性名称 = 属性值
        // 如果在声明属性的同时进行了初始化赋值，那么所有对象的属性就完全相同
        // 所以如果希望每个对象的属性不一致，那么可以不用在声明属性的时候进行初始化。
        // 那么属性会在构造对象的时候默认初始化，而默认初始化的值取决鱼属性的类型.
        // byte ,short, int ,long => 0
        // float, double => 0.0
        // boolean flg = false
        // char = 空字符
        // 引用数据类型 => null

        // 变量的作用域非常小，只在当前的大括号内有效
        // 属性不仅仅在当前类中有效，而且可以随着对象在其他地方使用
        // 变量使用前必须初始化，否则会出现错误，属性可以不用初始化，因为JVM会帮助我们自动完成初始化。
        String name = "zhangsan";

    }
}
class User05 {
    //String name = "zhangsan";
    String name;
}

