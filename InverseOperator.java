package com.operator;

/**
 * 演示 !（取反）的使用
 */
public class InverseOperator {
    public static void main(String[] args) {
        //！是取反 真变假  假变真
        System.out.println(60 > 20);//T
        System.out.println(!(60 > 20));//F

        //a^b 叫逻辑异或 当a和b不同时为true 相同时为false
        boolean b = (10 > 1) ^ (3 < 5);//（10>1）的表达式是true （3<5）的表达式的结果是true 因此根据结论，最后b是false
        System.out.println("b=" + b);//F

    }
}
