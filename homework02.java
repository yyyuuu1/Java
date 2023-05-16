package com.objectOriented.homework;

public class homework02 {
    public static void main(String[] args) {
        // 2.编写类A1，定义方法find，
        // 实现查找某字符串数组中的元素查找，并返回索引，
        // 如果找不到，返回-1
        String arr[] = {"jack", "xiaoming", "xiaoho"};
        A1 a = new A1();
        String name = "jack";
        int index = a.find(arr, name);
        if (index == -1) {
            System.out.println("找不到");
        } else {
            System.out.println("找到了下标是" + index);
        }
    }
}

class A1 {
    public int find(String[] arr, String name) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i])) {
                index = i;
            }
        }
        return index;
    }

}
