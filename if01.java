package com.sequentialcontrol.if_;

/**
 * 演示if语句的使用
 */
public class if01 {
    public static void main(String[] args) {
        //if语句也叫判断语句 比如
        int n = 3;
        //if语句的基本语法是
        /*
            if(逻辑表达式){
                ...代码
            }
         */
        if (n > 0) { //解读 if(n>0) 表示 如果n>0那么就说明条件为真 执行括号中的代码 当然和if配对经常出现的还有else else表示如果条件不成立就执行else中的代码
            System.out.println("该数大于0");
        } else {
            System.out.println("该数小于0");
        }

        //当然else 并不是一定要有的
        //没有else 也是可以的
        if (n > 0) {
            System.out.println(n);
        }


        //例子
        //判断一个数是否为润年
        //条件为能被4整除但不能被100整除或者能被400整除
        int date = 2022;
        if (date % 4 == 0 && date % 100 != 0 || date % 400 == 0) {//就是将判断闰年的条件，翻译成代码实现即可
            System.out.println(date + "是闰年");
        } else {
            System.out.println(date + "不是闰年");
        }
    }
}
