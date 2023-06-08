package com.objectOriented.OverLode;

public class OverLodeExercise01 {
    public static void main(String[] args) {
        // 1.编写程序，类Methods中定义三个重载方法并调用方法名为m
        // 三个方法分别接收一个int参数、两个int参数、一个字符串(String)参数。
        // 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息.
        // 在main()方法中分别用参数区别调用三个方法。

        Methods methods = new Methods();
        methods.m(2);
        methods.m(2, 3);
        methods.m("jack");
    }
}

class Methods {
    public void m(int n) {
        System.out.println(n * n);
    }

    public void m(int a, int b) {
        System.out.println(a * b);
    }

    public void m(String name) {
        System.out.println(name);
    }
}
