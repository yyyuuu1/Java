package com.objectOriented.constructor;

/**
 * 演示构造的注意事项和使用细节
 */
public class ConstructorDetail {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //使用的就是这个无参构造器
        /*
        public Dog(){

        }

         */

        Dog dog1 = new Dog(1);
        /*
        使用的就是带一个参数的构造器也就是这个
        public Dog(int age){
            this.age=age;
        }
         */


    }
}

class Dog {
    private int age;
    private String name;

    //1.一个类可以定义多个不同的构造器，即构造器重载 ·
    //这样就是三个构造器，也就是构造器的重载，注意不可以写两个一模一样的构造器否则会报错
    //举例
    //这样写就是错误的，因为重载是要参数个数，顺序，或者形参类型，至少一个不同才可以
//    public Dog(){
//
//    }
    //这样也可以，参数的顺序不同
    //public Dog(String name,int age){}

    public Dog() {

    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //2.构造器名和类名要相同
    //如果写的一个和类名不相同的构造器就会报错
    //这个是错误的
//    public A(){
//
//    }

    //3.构造器没有返回值
    //这个是错误的，如果写了返回类型，那么就变成了一个方法，不是构造器了，注意go'za
//    public int Dog(){
//
//    }

    //4.构造器是完成对象的初始化，并不是创建对象
    //5.在创建对象时，系统自动的调用该类的构造方法
    //我们在创建对的时候，一般都是 Dog dog = new Dog();如果这样写，那么系统在创建对象的时候，就会默认调用无参构造器也就是这个
    /*
    public Dgo(){

    }

   注意即使你不写这个，构造器，只要没有其他的有参构造器，那么无参构造器是默认都有的
     */

    //6.如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也 叫默认构造器)，使用javap指令 反编译看看
    //7.一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无 参构造器，除非显式的定义一下，即：Dog{}写(这点很重要)
    /*
    比如我们现在的dog类已经有了两个有参数的构造器，如果想要使用无参构造器，那么需要自己在重新定义一遍
     */

}
