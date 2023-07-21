package com.operator;

/**
 * 演示三元运算符
 */
public class TernaryOperatorDetail {
    public static void main(String[] args) {
        //表达式1和表达式2要为可以赋给接收变量的类型
        //(或可以自动转换/或者强制转换)
        int a = 3;
        int b = 8;
        int c = a > b ? (int) 1.1 : (int) 3.4;//虽然1.1是double类型 但是在前面进行了强转因此不会报错
        double d = a > b ? a : b + 3;//可以的，满足 int -> double
    }
}
