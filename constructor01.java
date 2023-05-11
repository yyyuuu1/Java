package com.objectOriented.constructor;

/**
 * 演示构造器的基本使用
 */
public class constructor01 {
    public static void main(String[] args) {


    }
}


class Person {

    private int age;
    private String name;

    //构造器的基本语法
        /*
        public Person(){
        }
         */

    //1.构造器的修饰符可以默认，也可以是public protected private
//    public Person(){
//
//    }
    private Person() {

    }

    //2.构造器没有返回值
    //这样有返回类型就不在是构造器了，而是一个方法
//    public int Person(){
//
//    }

    //3.方法名 和类名字必须一样
//    public a(){//这样写就会报错，因为构造器的名字要和，类名保持一致
//
//    }

    //4.参数列表和 成员方法一样的规则
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    //5.构造器的调用由系统完成
}

