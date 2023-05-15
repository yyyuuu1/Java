package com.objectOriented.homework;

public class homework01 {
    public static void main(String[] args) {
        // 1.编写类A，定义方法max，实现求某个double数组的最大值，并返回
        A a = new A();
        double[] arr = {};
        Double max = a.max(arr);
        if (max != null) {
            System.out.println(max);
        } else {
            System.out.println("你的输入有误");
        }
    }
}

class A {
    public Double max(double[] arr) {
        //我们先判断这个数组是否空，或者数组长度为0 我们就直接返回一个null
        if (arr.length > 0 && arr != null) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            return null;
        }

    }
}
