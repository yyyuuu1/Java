package com.objectOriented.this_;

/**
 * this关键字例题
 */
public class thisExercise {
    public static void main(String[] args) {
        // 定义Person类，里面有name、age属性，
        // 并提供compareTo比较方法，用于判断是否和另一个人相等，
        // 提供测试类TestPerson用于测试，名字和年龄完全一样，就
        // 返回true，否则返回false
        Person person1 = new Person("jack", 10);
        Person person2 = new Person("jack", 10);

        System.out.println(person1.compareTo(person2));

    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person person) {
        return this.age == age && this.name.equals(person.name);
    }
}
