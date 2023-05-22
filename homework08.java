package com.objectOriented.homework;

public class homework08 {
    public static void main(String args[]) {
        //1.  new Test()	是匿名对象， 匿名对象使用后，就不能使用
        //2.  new Test().count1() 创建好匿名对象后, 就调用count1()
        new Test().count1();
        //因为 new Test()	是匿名对象  所以在使用之后就不能在使用 了
        //所以在执行到Test t1= new Test();时Test的属性并没有被更改
        //因为这个创建了一个新的对象，指向的是 一块新的空间
        //所以在第一次调用t1.count2()；是得到的值是9
        Test t1 = new Test();
        t1.count2();
        t1.count2();
    }

}

class Test {
    int count = 9; //属性

    public void count1() { //Test类的成员方法
        count = 10;//这个count就是属性  改成 10
        System.out.println("count1=" + count); //10
    }

    public void count2() {  //Test类的成员方法
        System.out.println("count1=" + count++);
    }
}


