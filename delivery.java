package com.operator;

/**
 * 翻译
 * delivery 取模
 */
public class delivery {
    public static void main(String[] args) {
        //取模的公式
        int a = 10;
        int b = 3;
        int c = a % b; //该式子等于  a % b = a - a / b * b 这就是取模的公式
        System.out.println(c);//最终结果式：10-10/3*3=1

        //例题
        //华氏温度转摄氏温度的公式是5/9*(华氏温度-100)
        //但是考虑到Java语言特性的和数学，不能直接使用5，如果直接用5去除的话，在计算机看来5/9就等于0 0在任何数都是0，程序会出错

        //正确写法
        double huaShi = 1234.6;
        double sheShi = 5.0 / 9 * (huaShi - 100);
        System.out.println("华氏温度" + huaShi + " 对应的摄氏温度=" + sheShi);

        /*
        错误写法
        double huaShi = 1234.6;
        double sheShi = 5 / 9 * (huaShi - 100);
        System.out.println("华氏温度" + huaShi + " 对应的摄氏温度=" + sheShi);
         */
    }
}

