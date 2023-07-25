package chapter09;

public class Java04_Thread_Run {
    public static void main(String[] args) throws Exception {

        // TODO 线程 - 运行

//        MyThread3 t3 = new MyThread3();
//        t3.start();
//
//        MyThread4 t4 = new MyThread4();
//        t4.start();

//        MyThread5 t5 = new MyThread5("t5");
//        MyThread5 t55 = new MyThread5("t55");
//
//        t5.start();
//        t55.start();

        // TODO 构建线程对象时，可以只把逻辑传递给这个对象
        //      传递逻辑时，需要遵循规则：() -> { 逻辑 }
//        Thread t6 = new Thread(() -> {
//            System.out.println("线程执行1");
//        });
//
//        t6.start();
//
//        Thread t7 = new Thread(() -> {
//            System.out.println("线程执行2");
//        });
//
//        t7.start();

        // TODO 构建线程对象时，可以传递实现了Runnable接口得类得对象,一般使用匿名类
        Thread t8 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行");
            }
        });

        t8.start();

        System.out.println("main线程执行");
    }
}
// TODo 自定义线程
// 1. 继承线程类（父类）
// 2. 重写run方法
class MyThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("t3 线程执行");
    }
}
class MyThread4 extends Thread {
    @Override
    public void run() {
        System.out.println("t4 线程执行");
    }
}
class MyThread5 extends Thread {
    private String threadName;
    public MyThread5( String name ) {
        threadName = name;
    }
    @Override
    public void run() {
        System.out.println(threadName + " 线程执行");
    }
}
