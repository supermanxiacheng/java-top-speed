package chapter03;

import java.util.Map;

public class Java05_FlowControl {
    public static void main(String[] args) {

        // TODO 流程控制 - 重复执行（循环执行）
        // 根据条件重复执行某段代码
        // Java中主要用于循环的语法有3个：
        // 1. while ：有条件循环
        //   while ( 条件表达式 ) { 需要循环的代码 }
        // 基本的执行原理：while循环会判断条件表达式的结果是否为true
        //     如果为false，跳出循环结构
        //     如果为true，会执行大括号内的逻辑代码，代码执行完毕后，会重新对条件表达式进行判断
        System.out.println("第一步");
        int age = 30;
//        while ( age < 40 ) {
//            System.out.println("循环的代码");
//
//            age++;
//        }
        // 2. do...while
        // 语法执行原理和while语法基本相同，区别就在于循环代码是否至少执行一次。
        // while循环语法可能执行，可能不执行
        // do...while循环语法中的循环代码至少执行一次
        /*
          基本语法结构：
           do {
               循环代码
           } while (条件表达式)

         */
//        do {
//            System.out.println("循环的代码");
//        } while ( age < 40 );

        // 3. for
        // 如果条件表达式返回结果为false，那么跳过循环语句，直接执行后续代码，如果返回结果为true，那么执行循环代码
        // 初始化表达式用于对条件表达式中使用到的变量进行初始化
        // 循环代码执行后，会重新进行条件表达式的判断，如果判断结果为true，会重复执行循环代码
        /*
         for ( 初始化表达式; 条件表达式; 更新表达式 ) {
             循环的代码
         }
         */

        for ( int i = 0;i < 40;i++) {
            System.out.println("循环的代码");
        }

        System.out.println("第二步");

    }
}
