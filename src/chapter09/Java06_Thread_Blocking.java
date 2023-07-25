package chapter09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Java06_Thread_Blocking {
    public static void main(String[] args) throws Exception {

        // TODO 线程 - 阻塞
        // wait & sleep
        // 1. 名字
        //    wait : 等待
        //    sleep : 休眠
        // 2.从属关系
        //    wait : Object, 成员方法
        //    sleep : Thread, 静态方法
        // 3. 使用方式
        //    wait : 只能使用在同步代码中
        //    sleep : 可以在任意地方法使用
        // 4. 阻塞时间
        //   wait : 超时时间（会发生错误）
        //   sleep : 休眠时间（不会发生错误）
        // 5. 同步处理
        //   wait : 如果执行wait方法，那么其他线程有机会执行当前的同步操作。
        //   sleep : 如果执行sleep方法，那么其他线程没有机会执行当前的同步操作。

    }
}
