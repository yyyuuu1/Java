package com.array;

/**
 * 讲解二维数组的细节和注意事项
 */
public class TwoDimensionalArrayDetail {
    public static void main(String[] args) {
//        1.一维数组的声明方式有： int[]x 或者int x[]
        //一维数组的声明方式
        //int[] arr1;
        //int arr2[];

//        2.二维数组的声明方式有： int[][] y或者 int[] y[] 或者int y[][]
        //二维数组的声明方式
        //1.int[][] arr;
        //2.int[] arr[];
        //3.int arr[][];

//        3.二维数组实际上是由多个一维数组组成的，它的各个一维数组的长度可以相同，也可以不相同。
//        比如：map[][]是一个二维数组 map[]={{1,2},{3,4,5}} 由map[0]是一个含有两个元素的一维数组，map[1]是一个含有三个元素的一维数组构成，我们也称为列数不等的二维数组

        //创建一个二维数组，使用静态初始化的方式
        int[][] arr = {{1, 2}, {3, 4, 5}};//这是一个两行三列的二维数组，二维数组的本质是一维数组，各个一维数组的长度可以不相同
        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            //注意在内存循环遍历的时候要写arr[i].length 表示 得到 对应的 每个一维数组的长度 因为二维数组的本质是一维数组
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
