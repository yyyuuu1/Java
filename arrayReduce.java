package com.array;

import java.util.Scanner;

/**
 * 演示数组缩减
 */
public class arrayReduce {
    public static void main(String[] args) {
        //创建一个scanner对象接受用户的输入
        Scanner scanner = new Scanner(System.in);
        //定义一个数组
        int[] arr1 = {1, 2, 3};
        for (; ; ) {//表示死循环
            System.out.print("请确认是否继续缩减:");
            char c = scanner.next().charAt(0);
            if (c == 'y') {//表示确定缩减
                int[] arr2 = new int[arr1.length - 1];//创建一个比原数组小1的数组
                for (int i = 0; i < arr2.length; i++) {//拷贝原来的数组到新数组的内容
                    arr2[i] = arr1[i];
                }
                arr1 = arr2;//让原来的数组指向新的数组
                if (arr1.length == 0) {//如果数组的长度为0就不可以缩减了直接break
                    System.out.println("数组长度为0不可以继续缩减了");
                    break;
                }
            } else if (c == 'n') {
                break;
            }
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
