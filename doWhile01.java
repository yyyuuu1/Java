package com.sequentialcontrol.dowhile_;

/**
 * 演示 do while循环的基本操作
 */
public class doWhile01 {
    public static void main(String[] args) {
        //结论
        //.while 循环和do while循环的区别
        //do while 循环是先执行后判断，也就是说do while 循环一定会执行一次

        //首先我们先说两种循环的特点
        //while while循环的特点是先判断后执行
        //do while 特点是，先执行后判断，看演示

        //案例演示
        //定义一个布尔类型的变量
        boolean loop = false;
        //如果是while循环，会先判断循环条件。是否成立，loop的初始值就是false，因此不会输出hello，word
        while (loop) {
            System.out.println("hello,word");
        }

        //演示do while
        //do while 循环的特点是，不管什么先执行后判断，因此该循环会输出一句hello，word 输出完之后，再去判断条件，发现不满足条件，就不会在进入循环了
        do {
            System.out.println("hello,word");
        } while (loop);


    }
}
