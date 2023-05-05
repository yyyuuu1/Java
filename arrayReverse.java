package com.array;

/**
 * 演示数组反转
 */
public class arrayReverse {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr2.length; i++) {//数组拷贝
            arr2[i] = arr1[arr1.length - 1 - i];//
        }
        arr1 = arr2;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
