package com.objectOriented.VariableParameters;

/**
 * 演示可变参数的细节
 */
public class VariableParametersDetail {
    public static void main(String[] args) {
        T1 t1 = new T1();
        int map[] = new int[3];
        //1)可变参数的实参可以为0个或任意多个。
        t1.show("jack");
        //2)可变参数的实参可以为数组。
        t1.show(map);
    }
}

class T1 {

    public void show(String name, double... res) {
        double sum = 0;
        //3)可变参数的本质就是数组.在使用的过程中我们也可以感受到
        for (int i = 0; i < res.length; i++) {
            sum += res[i];
        }
        System.out.println(name + "的成绩是" + sum);
    }


    //4)可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
    public void show(int[] map, double... res) {

    }

    //这样是错误的
//    public void show(double... res, int n) {
//
//    }

    //5)一个形参列表中只能出现一个可变参数
    //也是错误的，只能有一个可变参数
//    public void show(double a, double... res, int... a) {
//
//    }
}
