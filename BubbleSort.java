package com.array;

/**
 * 演示冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr = {1, 2, 3, 5, 4, 6, 7, 8, 9, 0};
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 1;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
                    //使用异或的方式，可以不创建第三方的变量，减少内存的开销
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    flag = 0;
                }
            }
            //如果flag没有被修改成1说明这个数组本来就是有序的增加了效率
            if (flag == 1) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
