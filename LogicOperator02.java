package com.operator;

/**
 * 演示 |  || 的使用
 */
public class LogicOperator02 {
    public static void main(String[] args) {
        //结论
        //1)||短路或：如果第一个条件为true，则第二个条件不会判断，最终结果为true，效率高
        //2)|逻辑或：不管第一个条件是否为true，第二个条件都要判断，效率低
        //3)开发中，我们基本使用短路或||效率高

        int age = 50;
        if(age > 20 || age < 30) {
            System.out.println("ok1");
        }

        //&逻辑与使用
        if(age > 20 | age < 30) {
            System.out.println("ok2");
        }

        //看看区别
        //(1)||短路或：如果第一个条件为true，
        //则第二个条件不会判断，最终结果为true，效率高
        //(2)| 逻辑或：不管第一个条件是否为true，第二个条件都要判断，效率低
        int a = 4;
        int b = 9;
        if( a > 1 || ++b > 4) { // 可以换成 | 测试
            System.out.println("ok3");
        }
        System.out.println("a=" + a + " b=" + b); //4 10
    }
}
