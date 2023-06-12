package com.objectOriented.VariableParameters;

/**
 * 演示可变参数的基本使用
 */
public class VariableParameters01 {
    public static void main(String[] args) {
        //基本概念
        //java允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法。就可以通过可变参数实现
        //基本语法
        //访问修饰符 返回类型 方法名(数据类型...形参名){ }


        //需求
        //我们有这样一个需求，需要统计一个人三门课的成绩
        T t = new T();
        t.show("jack", 1, 2, 3);
    }
}

class T {
    //可变参数的本质是数组
    public void show(String name, double... res) {
        double sum = 0;
        for (int i = 0; i < res.length; i++) {
            sum += res[i];
        }
        System.out.println(name + "的成绩是" + sum);
    }

}
