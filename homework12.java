package com.objectOriented.homework;


public class homework12 {
    public static void main(String[] args) {
        // 12.创建一个Employee类，属性有(名字，性别，年龄，职位，薪水)，
        // 提供3个构造方法，可以初始化(1)(名字，性别，年龄，职位，薪水)，
        // (2)(名字，性别，年龄)(3)(职位，薪水)，
        // 要求充分复用构造器




    }
}

class Employee {
    String name;
    char gender;
    int age;
    String posts;
    double salary;


    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String posts, double salary) {
        this.posts = posts;
        this.salary = salary;
    }

    public Employee(String name, char gender, int age, String posts, double salary) {
        this(name, gender, age);//在构造器器中调用其他构造器
        //访问构造器语法：this(参数列表)；注意只能在构造器中使用(即只能在构造器中访问另外一个构造器，必须放在第一条语句)
        //所以只能只能调用一个构造器
        //这样写的话给我们提供了比较大的方便
        this.posts = posts;
        this.salary = salary;


        //还可以这样写，但是比较麻烦不推荐
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.posts = posts;
//        this.salary = salary;
    }
}