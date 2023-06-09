package com.objectOriented;

import java.util.List;

/**
 * parameter list -> 形参列表
 * 演示形参列表的注意事项和使用细节
 */
public class parameterListDetail {
    public static void main(String[] args) {
        //3.调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型 的参数！
        T6 t6 = new T6();
        //因为hi02方法形参的类型是两个int 因此在传入参数的时候，就需要传入两个int类型的参数，如果传入的类型不一致，就会报错
        //示例
        //t6.hi02(1,1.0);//错误的

        //传入参数的个数也要保持一致，
        //示例
        //t6.hi02(1,2,3);//错误的，传入参数的个数，很形参不一致

        t6.hi02(1, 2);
    }
}

class T6 {
    //1.一个方法可以有0个参数，也可以有多个参数，中间用逗号隔开，比如
    public void hi() {

    }

    public void hi01(int n1) {

    }

    public void hi02(int n1, int n2) {

    }

    //2.参数类型可以为任意类型，包含基本类型或引用类型，比如

    /**
     * 演示参数可以是任意类型
     *
     * @param n1   整形
     * @param obj  Object类的参数
     * @param list 一个集合
     * @param map  一个数组
     */
    public void hi03(int n1, Object obj, List list, int[] map) {

    }

    //4.方法定义时的参数称为形式参数，简称形参；方法调用时的传入参数称为实际参数，简称实参，实参和形参的类型要一致或兼容、个数、顺序必须一致！(在main方法中已经演示)

    //5.方法体 里面写完成功能的具体的语句，可以为输入、输出、变量、运算、分支、循环、方法调用，但里面不能再定义方法！即：方法不能嵌套定义。
    public void hi04() {//定义了一个方法
        //如果在方法中，再写一个方法就会报错
        //void hi05(){}//这个是错误的
    }
}
