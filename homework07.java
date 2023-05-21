package com.objectOriented.homework;

public class homework07 {
    public static void main(String[] args) {
        // 7.设计一个Dog类，有名字、颜色和年龄属性，定义输出方法
        // show(显示其信息并创建对象，进行测试、 【提示this.属性】

        Dog a = new Dog("小明", "红色", 10);
        a.show();
    }
}

class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.println("名字为" + this.name + "颜色为" + this.color + "年龄为" + this.age);
    }
}