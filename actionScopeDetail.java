package com.objectOriented.actionScope;

/**
 * 演示作用域的细节
 */
public class actionScopeDetail {
    public static void main(String[] args) {

    }
}

class T {
    public int age = 0;

    public void cry() {
        //1.属性和局部变量可以重名，访问时遵循就近原则。
        int age = 1;
        System.out.println(age);//此时输出的就是1,因为默认遵守就近原则，如果把cry()方法的age属性注释掉，那么age输出的就是0

        //比如
        int a = 0;//同一个作用域中，两个局部变量的名字不可以重复，如果是，不同作用域，那么不影响
    }

    //2.在同一个作用域中，比如在同一个成员方法中，两个局部变量，不能重名。
    public void hi() {
        int a = 0;
        //int a = 0;//同一个作用域中，两个局部变量的名字不可以重复，如果是，不同作用域，那么不影响
    }

    //3.属性生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁。局部变量，生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而销毁。即在一次方法调用过程中。
    //我们可以看到，局部变量的生命周期很短，在方法结束掉之后就会销毁,因此在hi01方法结束后sum变量也跟着一起消失了
    public void hi01() {
        int sum = 1;
        System.out.println(sum + "a");
    }

    //4.作用域范围不同 全局变量/属性：可以被本类使用，或其他类使用(通过对象调用) 局部变量：只能在本类中对应的方法中使用
    public void hi02() {
        System.out.println(age);//可以直接输出本类的全局变量age
        //System.out.println(sum);//这是错误的 不能输出因为sum是局部变量
        T1 t1 = new T1();
        System.out.println(t1.c);//可以访问不同类的全局变量使用对象.属性名访问
    }

    //5.修饰符不同 全局变量/属性可以加修饰符 局部变量不可以加修饰符
    public void hi03() {
        //public int a;//这是错误的，局部变量不可以增加访问修饰符
    }
}

class T1 {
    public int c = 0;
}
