package com.sequentialcontrol.switch_;

import java.util.Scanner;

/**
 * 演示switch的基本语法
 */
public class switch01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /*
        这是一个switch的基本语法
        switch(){
            case : //主要case后面是冒号不是分号
                break; //break;一定要加，否则会一直执行到default
            default : //表示 在上面的条件都不满足后，去执行default中的代码

        }
         */
        switch (n) {
            case 1:
                System.out.println("输入的数字是1");
                break;
            case 2:
                System.out.println("输入的数字是2");
                break;
            case 3:
                System.out.println("输入的数字是3");
                break;
            case 4:
                System.out.println("输入的数字是4");
                break;
            case 5:
                System.out.println("输入的数字是5");
                break;
            default:
                System.out.println("请输入1-5之间的数字");
                break;
        }


        //switch的细节
        //1.表达式数据类型，应和case后的常量类型一致，或者是可以自动转成可以相互比较的类型，比如输入的是字符，而常量是int
        //比如
        //正常情况下 ，我们switch后面跟的变量，一般是要和我们的case语句后面的，类型保持一致，但是这里写的就是char类型，但是case后面是int类型，因为char和int可以可以转换因此不会报错
        char c = scanner.next().charAt(0);//表示接受一个字符
        switch (c) {
            case 1:
                System.out.println(c);
                break;
            default:

        }
        //2. switch(表达式)中表达式的返回值必须是：(byte，short,int,char,enum[枚举]，String)
        //3.case子句中的值必须是常量，而不能是变量
//        switch (c) {
//            case c://这样就是错误的
//                break;
//        }
        //4.default子句是可选的，当没有匹配的case时，执行default
        switch (c) {
            case '1':
                break;
            //即使不写default也不会报错
        }
        //5.break语句用来在执行完一个case分支后使程序跳出switch语句块；如果没有写break 程序会执行到switch结束
        switch (c) {
            case '1':
                System.out.println(1);
            case '2':
                System.out.println(2);
                //如果不加break那么会把两句输出语句都输出
        }
    }
}
