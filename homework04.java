package com.objectOriented.homework;

public class homework04 {
    public static void main(String[] args) {
        // 4.编写类A03，实现数组的复制功能copyArr，
        // 输入旧数组，
        // 返回一个新数组，元素和旧数组一样

        int arr[] = {1, 2, 3, 4, 5};
        A03 a = new A03();
        a.copy(arr);
    }
}

class A03 {
    public void copy(int arr[]) {
        int arrnew[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrnew[i] = arr[i];
        }

        arr = arrnew;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}