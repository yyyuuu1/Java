package com.variable;

public class variable01 {
    public static void main(String[] args) {
        //变量的三要素 类型+名称+值
        //如何声明一个变量
        int a = 10;//这就表示声明了一个int类型的变量 int表示类型 a表示变量名  10表示值

        //变量的使用注意细节必须先声明在使用
//        System.out.println(b);//这就是错误的写法 直接输出了b，但是b并没有先声明，而且是输出之后在声明因此会报错
//        int b=0;

        //变量同一作用域内不能重命名
        //int a = 10;//因为在main方法中已经有一个a变量了此时如果在声明一个a变量就会报错
        a = 20;//注意如果是这样写，前面不写数值类型，就不会报错，这样表示的是，对a变量进行重新赋值，将a变量的值改为20
        //float a=1f;//即使是不同数据类型，但是变量名相同也会报错


        //演示+号的使用
        //当左右两边都是数值型时做加法运算
        int j = 2;
        int k = 2;
        int sum = j + k;
        System.out.println("sum=" + sum);//此时输出的结果是4因为加号左右两边都是数组类型(int)也可以是其他数值类型 所以在这里+做加法运算
        //当左右两边有一边时字符串时做拼接运算
        String str = "hello";
        char c = 'a';
        System.out.println(j + str);//这里输出的就是 2hello 因为+两边其中一边是String类型
        /**
         *(注意:因为char的本质还是数字，因此char类型在和int类型相加的时候，会自动转换，将char类型转换为对应的ASCII表中的对应的值)
         */
        System.out.println(c + j);//这里输出的就是 99 因为+两边其中一边是char类型,char类型在加减运算的时候会自动转换
        //运算顺序，从左向右

    }
}
