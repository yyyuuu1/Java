package com.variable.dataType;

public class intDetail {
    public static void main(String[] args) {
        //1.Java各整数类型有固定的范围和字段长度，不受操作系统的影响，保证的Java程序的可移植性
        int a = 10;//int 类型占4个字节
        boolean loop = false;//boolean 类型占1个字节
        //注意如果小数后面不加f,那么在Java中默认是double类型
        //float v=1.2;//因此在将一个 小数赋给一个float类型变量的时候会报错，因为没有在数组后加f默认是double类型，因为float是4个字节而double是8个字节
        float f = 1.0f;//float 类型占4个字节
        double sum = 3.14;//double 类型占8个字节
        char c = 'a';//char 类型占2个字节
        short b = 2;//short 类型占2个字节
        long s = 6;//long 类型占8个字节
        byte bit = 1;//byte 类型占1个字节

        //2.Java整数类型默认时int型 ，如果时long型要在后面添加'l'或者L
        long l = 1;//此时没有在后面加上l或者L 因为默认是int,int 占四个字节，而long占8个字节，因此int可以存放在long的类型中，所以不会报错，加上l或者是L才表示是long类型

        //3.Java程序中声明变量为int型，除非要表示的数字过大才使用long
        //int aa = 1231231231233123;//这个数字 就太大了，因此会报错，超过了int类型的返回
        long bb = 123123123123123l;//在最后加上了l说明是long类型可以存放下更大的数字

        //4.bit是计算机最小的存储单位
        //byte：byte数据类型是8位带符号的二进制补码整数。最小值为-128，最大值为127（含）。的byte数据类型可以是在大型保存存储器有用 阵列，
    }
}
