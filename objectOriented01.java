package com.objectOriented;

/**
 * 演示面向对和面向过程的区别
 */
public class objectOriented01 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 0, 4, 5, 6, 7, 8, 9};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }

        //创建一个T对象调用冒泡排序的方法
        T t = new T();
        t.bubbleSort(arr);
        //输出数组的信息
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


class T {
    public void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

