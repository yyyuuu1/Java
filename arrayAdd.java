package com.array;

import java.util.Scanner;

/**
 * 演示数组扩容
 */
public class arrayAdd {
    public static void main(String[] args) {
        //创建一个scanner对象接受用户的输入
        Scanner scanner = new Scanner(System.in);
        //定义一个数组
        int[] arr1 = {1, 2, 3};
        for (; ; ) {//表示死循环
            System.out.print("请输入你要扩容的数:");
            int n = scanner.nextInt();//接受要扩容的数
            int[] arr2 = new int[arr1.length + 1];//创建一个比原来数组大1的数组
            for (int i = 0; i < arr1.length; i++) {//拷贝原来的数组到新数组的内容
                arr2[i] = arr1[i];
            }
            arr2[arr2.length - 1] = n;//把要扩容的数，赋给新数组的最后一个位置
            arr1 = arr2;//让原来的数组指向新的数组
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.print("\n请确认是否继续扩容:");
            char c = scanner.next().charAt(0);
            if (c == 'y') {
                System.out.println("继续扩容");
            } else if (c == 'n') {
                break;
            }
        }
    }
}
