package com.operator;

/**
 * 翻译
 * Relational operators 关系运算符
 */
public class RelationalOperators {
    public static void main(String[] args) {
        //1.关系运算符的结果都是Boolean型的，要么都是true或者是false
        System.out.println(2 > 3);//返回的就是false

        //2.关系运算符组成的表达式，我们称为关系表达式

        //3.比较运算符==不要误写成=  （一个等号是赋值运算符，两个等号才是比较运算符）\
        int a = 2;//一个=号表示赋值
        int b = 3;
        /**
         * 主要==在判断，基本数据类型的时候，比较的是，两个数值是否相等
         * 如果是和引用类型进行比较，那么比较的就不是，数值，而且地址
         */
        if (a == b) {
            System.out.println("相等");
        } else {
            System.out.println("失败");
        }
    }
}
