package com.objectOriented.actionScope;

/**
 * 演示作用域的基本使用
 */
public class actionScope01 {
    public static void main(String[] args) {
        //1.在java编程中，主要的变量就是属性(成员变量)和局部变量。
        //这些都是局部变量
        int a = 0;
        double d = 1.0;
        //2.我们说的局部变量一般是指在成员方法中定义的变量。
    }
}

class Cat {
    //3.java中作用域的分类 全局变量：也就是属性，作用域为整个类体Cat类：cry eat 等方法使用属性
    //                  局部变量：也就是除了属性之外的其他变量，作用域为定义它的代码块中！

    //4.全局变量(属性)可以不赋值，直接使用，因为有默认值，局部变量必须赋值后，才能使用，因为没有默认值。
    //如果不赋值，默认是和之前的基本数据类型一样
    public int age;//该变量为全局变量,作用范围在Cat这个类中，想要在其他类中去访问，就需要创建对象

    public void cry() {
        int c;
        //System.out.println(c);//可以看到c是一个局部变量，但是我们没有给c赋值直接使用，就会报错，那是因为局部变量需要赋值才可以直接使用
        System.out.println(age);
    }


}
