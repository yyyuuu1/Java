package com.objectOriented.Method;

/**
 * 演示成员方法的习题
 */
public class MethodExercise01 {
    public static void main(String[] args) {
        //编写一个AA类有一个方法判断一个数是奇数还是偶数返回boolean
        AA aa = new AA();
        //因为该方法返回一个布尔值 我们只需要判断如果返回的是true那么就说明是偶数，反之就是奇数
        if (aa.checkNum(2)) {
            System.out.println("是偶数");
        } else {
            System.out.println("是奇数");
        }
    }
}

class AA {
    //该方法返回一个布尔值
    public boolean checkNum(int n) {
        //使用到了三元运算符，如果n%2==0条件为真，就返回第一个表达式的值，反之返回第二个表达式的值
        return n % 2 == 0 ? true : false;
    }
}
