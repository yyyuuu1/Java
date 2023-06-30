package com.sequentialcontrol.for_;

/**
 * for循环的基本使用
 */
public class for01 {
    public static void main(String[] args) {

        //在我们的开发中，循环做到了很大的遍历，比如一个最简单的需求，我们需要输出10句相同的话，
        // 可能在我们没有学习循环之前。就是简单的10句输出语句，但是这样代码可读性不高，
        // 原来10句才可以完成的事情，通过我们的循环只需要3行既可以实现

        //通过下面的两种不同方法实现，我们明显可以看出，使用循环的方式更加简单

        //这是传统的方法
        System.out.println("hello,word");
        System.out.println("hello,word");
        System.out.println("hello,word");
        System.out.println("hello,word");
        System.out.println("hello,word");
        System.out.println("hello,word");
        System.out.println("hello,word");
        System.out.println("hello,word");
        System.out.println("hello,word");


        //使用循环完成
        for (int i = 0; i < 10; i++) {
            System.out.println("hello,word");
        }

        //for循环的细节
        //1.循环条件是返回一个布尔值的表达式
        //比如
        //其中i<10 就是循环条件，返回的是布尔值
        for (int i = 0; i < 10; i++) {

        }
        //2.for(;循环判断条件；)中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略
        //这个写法也是可以的，把循环变量初始化写到外面，循环变量的迭代，写到循环操作中
//        int i = 0;
//        for (; i < 10; ) {
//            System.out.println(i);
//            i++;
//        }

        //还可以这样写，循环变量的初始化，循环条件，循环变量的迭代都不写，这样也不会错
        //比如
        //这样写就表示，无线循环，在一定的情况下，是会用到这个写法的
        for (; ; ) {

        }

        // 3.循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开
        //比如
        //有多个循环变量初始化也是可以的
//        for (int i = 0, j = 0; i < 10; i++, j++) {
//
//        }
    }
}
