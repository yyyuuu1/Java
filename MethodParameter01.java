package com.objectOriented.Method;

/**
 * 演示方法的传参机制
 */
public class MethodParameter01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        //创建AA对象 名字 obj
        AAA aaa = new AAA();
        aaa.swap(a, b); //调用swap(该方法用于交换两个数)

        //为什么这里明明在调用了交换的方法之后，为什么输出的数，还是没有交换的呢，那是因为基本数据类型，传递的是值（值拷贝）形参的变化不影响实参
        System.out.println("main方法 a=" + a + " b=" + b);//a=10 b=20
    }
}

class AAA {
    public void swap(int a, int b) {
        System.out.println("\na和b交换前的值\na=" + a + "\tb=" + b);//a=10 b=20
        //完成了 a 和 b的交换
        int tmp = a;//定义一个辅助变量，用于交换
        a = b;
        b = tmp;
        System.out.println("\na和b交换后的值\na=" + a + "\tb=" + b);//a=20 b=10
    }
}