package com.objectOriented.OverLode;

/**
 * 演示重载的好处
 */
public class OverLode {
    public static void main(String[] args) {
        //需求我们现在需要输出两个数，一个类型是int 类  还有一个是double类型的

        T7 t7 = new T7();
//        t7.hi01(10);
//        t7.hi02(1.0);

        //使用重载之后，就会根据我们传入的参数，然后选择对应的方法，这样只需要写一个方法，并且传入不同的参数即可实现
        t7.print(10);
        t7.print(1.0);

    }
}

class T7 {

    //使用重载解决
    public void print(int n1) {
        System.out.println(n1);
    }

    public void print(double n2) {
        System.out.println(n2);
    }

    //没有使用重载，在输出不同数字的时候，就需要两个不同的方法，每个方法我们还要给他取，对应的名字，增加了我们的工作量
//    public void hi01(int n1) {
//        System.out.println(n1);
//    }
//
//    public void hi02(double n2) {
//        System.out.println(n2);
//    }

}
