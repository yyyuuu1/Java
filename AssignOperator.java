package com.operator;

/**
 * 演示复合运算符
 */
public class AssignOperator {
    public static void main(String[] args) {
        //复合运算符会进行类型转换
        byte b=3;
        b+=2;//等价与b=(byte)(b+2);如果直接写b=b+2；会报错

        b++;//等价与b=(byte)(b+1);
    }
}
