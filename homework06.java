package com.objectOriented.homework;

public class homework06 {
    public static void main(String[] args) {
        // 6.编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，
        // 定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示)并创建两个对象，分别测试
        Cale cale = new Cale(2, 2);
        System.out.println("和=" + cale.add());
        System.out.println("差=" + cale.minus());
        System.out.println("乘=" + cale.mul());
        Double res = cale.div();
        if (res != null) {
            System.out.println("商=" + res);
        }
    }
}

class Cale {
    double a;
    double b;

    public Cale(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double minus() {
        return a - b;
    }

    public double mul() {
        return a * b;
    }

    public Double div() {
        //题目明确要求如果除数为0要提示所以定义成Double类如果正常定义成double要返回null时会报错
        if (b == 0) {//除数为0的情况
            System.out.println("不能为0");
            return null;
        } else {
            return a / b;
        }

    }
}