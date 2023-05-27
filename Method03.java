package com.objectOriented.Method;

/**
 * 演示方法在内存中的调用机制
 */
public class Method03 {
    public static void main(String[] args) {
        //创建T4的实例对象
        T4 t4 = new T4();
        /*
        因为程序一执行到方法，就会在栈区中开辟一个新的栈，因为我们的main方法也是方法，所以在栈区中会先有一个main的栈区（该栈区里面的内容就是main方法中的代码）
        当执行到 int sum = t4.getSum(1,2)这句代码的时候，那么会在栈区中，新开辟一个栈，然后就是传递参数，当执行到getSum()方法中的return语句的时候，就会
        就会返回给（t4.getSum()），此时，该方法的栈区就会被释放
         */
        int sum = t4.getSum(1, 2);
        System.out.println(sum);

        //结论
        //1.当程序执行到方法时，就会开辟一个独立的空间（栈空间）
        //2.当方法执行完毕，或者执行到return语句时，就会返回
        //3.返回到调用方法的地方
        //4.返回后继续继续后面的代码
        //5.当main方法（栈）执行完毕整个程序退出
    }
}


class T4 {
    public int getSum(int n1, int n2) {//该方法用于计算两个数相加的和，最后并返回
        return n1 + n2;
    }
}


