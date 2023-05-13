package com.objectOriented.constructor;

/**
 * 构造器的习题
 */
public class ConstructorExercise {
    public static void main(String[] args) {
        // 在前面定义的Cat类中添加两个构造器：
        // 第一个无参构造器：
        // 利用构造器设置所有人的age属性初始值都为18
        // 第二个带pName和pAge两个参数的构造器：
        // 使得每次创建Person对象的同时初始化对象的
        // age属性值和name属性值。
        // 分别使用不同的构造器，创建对象.
        Cat cat = new Cat();
        System.out.println(cat.name);
        System.out.println(cat.age);
        Cat cat1 = new Cat(2, "jack");
        System.out.println(cat1.name);
        System.out.println(cat1.age);
    }
}

class Cat {

    public int age;
    public String name;

    //无参构造器
    public Cat() {
        age = 18;
    }

    //带两个参数的构造器
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
