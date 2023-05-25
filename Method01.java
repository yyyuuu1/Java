package com.objectOriented.Method;

/**
 * 方法的快速入门
 */
public class Method01 {
    public static void main(String[] args) {
        //1)添加speak成员方法，输出 “hello,word”
        //2)添加cal01成员方法，可以计算从1+..+1000的结果
        //3)添加cal02成员方法，该方法可以接收一个数n，计算从1+..+n的结果
        //4)添加getSum成员方法，可以计算两个数的和
        T3 t3 = new T3();
        t3.speak();
        t3.cal01();
        t3.cal02(2);
        t3.getSum(1, 2);
    }
}

class T3 {//创建一个类
    public void speak() {//写了一个speak方法返回类型是void
        System.out.println("hello,word");
    }

    public void cal01() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void cal02(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //该方法接受两个参数，也叫形参，在调用方法的时候，我们传入的参数就是实参
    public void getSum(int a, int b) {
        System.out.println(a + b);
    }
}
