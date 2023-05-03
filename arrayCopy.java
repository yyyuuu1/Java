package com.array;

/**
 * 演示数组拷贝
 */
public class arrayCopy {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[arr1.length];//创建一个和arr1一样的数组
        for (int i = 0; i < arr2.length; i++) {//把原数组的内容拷贝到新数组去
            arr2[i] = arr1[i];
        }
        arr1 = arr2;//原来数组的指向新数组的，这样原来的数据空间就会被销毁
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
