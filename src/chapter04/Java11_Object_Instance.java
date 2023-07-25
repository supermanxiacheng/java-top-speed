package chapter04;

public class Java11_Object_Instance {
    public static void main(String[] args) {

        // TODO 面向对象 - 构建对象
        // 构造方法：专门用于构建对象
        // 如果一个类中没有任何的构造方法，那么JVM会自动添加一个公共的，无参的构造方法，方便对象的调用
        // TODO : 基本语法： 类名（）{}
        //  1. 构造方法也是方法，但是没有void关键字。
        //  2. 方法名和类名完全 相同
        //  3. 如果类中没有构造方法，那么JVM会提供默认的构造方法
        //  4. 如果类中有构造方法，那么JVM不会提供默认的构造方法
        //  5. 构造方法也是方法，所以也可以传递参数，但是一般传递参数的目的是用于对象属性的赋值
        //System.out.println("before...");
        User11 user = new User11("zhangsan");
        //System.out.println("after...");
        user.test();
        System.out.println(user.username);
        // 代码块，是在构造对象之前执行的

    }
}
class User11 {
    String username;

    {
        System.out.println("代码块1");
    }

    User11(String name) {
        username = name;
        System.out.println("user...");
    }
    {
        System.out.println("代码块2");
    }
    void test() {
        System.out.println("test...");
    }
    {
        System.out.println("代码块3");
    }
}

