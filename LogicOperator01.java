package com.operator;

/**
 * 翻译
 * LogicOperator 逻辑运算符
 * 演示& &&的使用
 */
public class LogicOperator01 {
    public static void main(String[] args) {
        //结论
        //1.&&短路与：如果第一个条件为false，则第二个条件不会判断，最终结果为false，效率高
        //2.&逻辑与：不管第一个条件是否为false，第二个条件都要判断，效率低
        //3.在开发中，我们使用的基本是短路与&&效率高

        //演示&   &&
        int age = 50;
        if (age > 20 && age < 90) {//&& 不会强制去判断两个表达式，&&表示一个为真即可
            System.out.println("ok1");
        }

        //&逻辑与使用
        if (age > 20 & age < 90) {//& 要求判断两个等式，都要去判断
            System.out.println("ok2");
        }

        //区别
        int a = 4;
        int b = 8;
        //对于&&短路与而言，如果第一个条件为false ,后面的条件不再判断
        //对于&逻辑与而言，如果第一个条件为false ,后面的条件仍然会判断
        if (a < 1 & ++b < 50) {
            System.out.println("ok3");
        }
        System.out.println("a=" + a + " b=" + b);// 4 9
    }
}
