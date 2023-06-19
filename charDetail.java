package com.variable.dataType;

public class charDetail {
    public static void main(String[] args) {
        //1.字符常量是用单引号括起来的单个字符 （可以是一个中文也可以是一个数字或者字母）
        char c1 = 97;
        System.out.println(c1); // a

        char c2 = 'a'; //输出'a' 对应的 数字
        System.out.println((int) c2);
        char c3 = '雨';
        System.out.println((int) c3);//38632
        char c4 = 38632;
        System.out.println(c4);//雨

        //2.Java允许使用转义字符'\'来将其后的字符转变为特殊字符常量   比如char n3= '\n' 这表示一个字符而并非两个
        char n1 = '\n';//这表示一个字符
        char n2 = '\t';//这表示一个字符

        //3.在Java char的本质是一个整数，在输出时是Unicode码对应的字符
        System.out.println('a' + 10);//107
        //4.可以直接给char赋一个整数，输出是会按照Unicode字符输出
        char c5 = 122;
        System.out.println(c5);
        //5.char类型是可以进行运算的，相当于一个整数，都有对应的Unicode码
        System.out.println(c5 + c3);//会把c5对应的Unicode码和c3对象的Unicode码加起来并输出
    }
}
