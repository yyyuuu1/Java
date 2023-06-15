package com.variable;

public class AutoConvert {
    public static void main(String[] args) {
        //Java在进行赋值运算时，精度小的类型自动转换成为精度大的数据类型
        //演示自动转换
        int num = 'a';//会将 char -> int 因此在输出的时候，会输出a对应的Unicode
        double d1 = 80; //会将 int -> double 因此在输出的时候，会输出80.0
        System.out.println(num);//97
        System.out.println(d1);//80.0

    }
}
