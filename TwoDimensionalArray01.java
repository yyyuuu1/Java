package com.array;

/**
 * 演示 二维数组的使用
 */
public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        //讲解二维数组初始化的三种方式

//        1.动态初始化（第一种方式）
//        语法：类型[]]数组名=new 类型大小
//        比如
        //int[][] arr = new int[2][3];//表示创建了一个2行3列的二维数组

//        2.动态初始化（第二种方式）
//        先声明：类型 数组名[][]
//        再定义（开辟空间)数组名 =new类型大小
//        赋值（有默认值，比如int类型的就是0）

        int[][] arr;//先声明数组但是并没有为该数组在内存中分配空间
        arr = new int[2][3];//这里是真的创建数组，会在内存中分配空间

//        3.静态初始化
//        1.定义 类型 数组名三（（值1，值2..），（值1，值2..），（值1，值2..》
//        2.使用即可固定方式访问]
//        解读
//        1.定义了一个二维数组 arr[][]
//        2.arr有三个元素(每个元素都是一维数组)
//        3.第一个一维数组有3个元素，第二个一维数组有3个元素，第三个一维数组有1个元素

        //这里表示创建了一个2行3列的一个二位数组，因为二维数组是由一维数组组成的，相当于在二维数组中，第一个一维数组中有三个元素，第二个一维数组中，有2个元素
        int[][] arr1 = {{1, 2, 3}, {1, 2}};

    }
}
