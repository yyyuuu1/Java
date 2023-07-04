package com.operator;

import java.util.Scanner;

/**
 * 演示scanner的使用
 */
public class input {
    public static void main(String[] args) {
        //scanner是用来接受用户的输入的，在使用scanner时需要引入对应的包 (import java.util.Scanner;)
        //这个概念会在后面会说到

        //创建一个scanner对象
        /*
        new 表示创建一个对象（会在后面，面向对象的内容中讲到）
        System.in表示的是从键盘获取输入的值
        System.out表示从屏幕输出
        具体的可以去了解基本输入输出
         */

        //得到一个scanner对象
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();//接受字符串的输入
        String str1 = scanner.nextLine();//接受字符串的输入,和上面的区别是，next()接受到空格就结束了，如果需要接受空格就使用nextLine()

        System.out.println("请输入年龄");
        int age = scanner.nextInt(); //接收用户输入int

        System.out.println("请输入工资");
        double sal = scanner.nextDouble(); //接收用户输入double

        System.out.println("人的信息如下:");
        System.out.println("名字=" + str + " 年龄=" + age + " 工资=" + sal);

        //还有很多方法，比如接受一个char
        char c = scanner.next().charAt(0);//表示接受一个字符


    }
}
