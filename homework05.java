package com.objectOriented.homework;

public class homework05 {
    public static void main(String[] args) {
        // 5.定义一个圆类Circle，定义属性：半径，
        // 提供显示圆周长功能的方法，提供显示圆面积的方法

        Circle a = new Circle(3);
        System.out.println(a.C());
        System.out.println(a.S());
    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double C() {
        return 2 * Math.PI * radius;//不能直接定义PI实在Math.PI这样子才对

    }

    public double S() {
        return Math.PI * radius * radius;

    }


}