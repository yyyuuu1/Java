package com.objectOriented.Method;

/**
 * 演示方法调用的细节
 */
public class MethodDetail01 {
    public static void main(String[] args) {
        //方法调用细节说明
        //1.同一个类中的方法调用：直接调用即可。比如print(参数)；案例演示：A类 sayOk 调用 print()
        //2.跨类中的方法A类调用B类方法：需要通过对象名调用。比如 对象名.方法名(参数)；案例演示：B类 sayHello 调用 print()
        //3.特别说明一下：跨类的方法调用和方法的访问修饰符相关  我们现在的访问修饰符都是public 后面讲到访问修饰符的时候，会讲解

        A a = new A();
        a.m1();
    }
}

class A {
    //同一个类中的方法调用：直接调用即可
    public void print(int n) {
        System.out.println("print()方法被调用 n=" + n);
    }

    public void sayOk() { //sayOk调用 print(直接调用即可)
        print(10);//调用了A类的print方法
        System.out.println("继续执行sayOK()~~~");
    }


    //跨类中的方法A类调用B类方法：需要通过对象名调用

    public void m1() {
        //先创建B对象, 然后在调用方法即可
        System.out.println("m1() 方法被调用");
        B b = new B();
        b.hi();
        //在调用完B类的方法后，还会回到A类的m1()方法继续执行下面的代码，如果没有就结束该方法，然后回到main方法
        System.out.println("方法继续执行:)");
    }
}

class B {
    public void hi() {
        System.out.println("B类中的 hi()被执行");
    }
}