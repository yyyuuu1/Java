package com.array;

/**
 * 演示数组的细节
 */
public class arrayDetail {
    public static void main(String[] args) {
        int[] arr = new int[4];//创建了一个int类型的数组

//        1.数组是多个相同类型数据的组合，实现对这些数据的统一管理
        //arr是一个int类型的数组，如果也就只能存放int类型数据，如果存放其他类型的数据会报错,但是比如是一个char可以和int互相转换的就可以也就不会报错
//        char c = 'a';
//        double d = 1.1;
//        //arr[1]=d;//这就会报错。是错误的
//        arr[0] = c;//正确，因为char的本质还是一个数字 char->int

//        2.数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用。
        String[] arr1 = {"jack", "tom"};

//        3.数组创建后n 如果没有赋值，有默认值int 0,short 0, byte 0, long 0,float 0.0,double 0.0,char \u0000 boolean false,String null
        //如果是int 类型数组没有给他赋值，那么数组中存放的就是0
        //如果是short 类型数组没有给他赋值，那么数组中存放的就是0
        //如果是byte 类型数组没有给他赋值，那么数组中存放的就是0
        //如果是long 类型数组没有给他赋值，那么数组中存放的就是0
        //如果是float 类型数组没有给他赋值，那么数组中存放的就是0.0
        //如果是double 类型数组没有给他赋值，那么数组中存放的就是0.0
        //如果是char 类型数组没有给他赋值，那么数组中存放的就是\u0000
        //如果是boolean 类型数组没有给他赋值，那么数组中存放的就是false
        //如果是String  类型数组没有给他赋值，那么数组中存放的就是null

        //举例
        //我们创建了一个int类型的数组，我们并没有给他赋值，那么遍历完数组的结果就是都是0
        System.out.println("输出int类型的arr数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("输出String类型的数据");
        //因为我们给arr1这个数组赋值了，所有并没有输出null
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

//        4.使用数组的步骤1.声明数组并开辟空间2给数组各个元素赋值3使用数组
        //第一步
        int[] arr2;//声明的一个数组
        //第二步
        arr2 = new int[3];//给数组开辟空间
        //第三步
        for (int i = 0; i < arr2.length; i++) {//遍历数组
            System.out.print(arr2 + " ");
        }

//        5.数组的下标是从0开始的。
        //在运行的时候会报错，因为数组的下标从0开始，因此对于arr数组来说，最大的下标就是3，因此在运行下面这段代码的时候会报数组下标越界异常ArrayIndexOutOfBoundsException
//        for (int i = 0; i < 10; i++) {
//            System.out.println(arr[i]);
//        }

//        6.数组下标必须在指定范围内使用，否则报：下标越界异常，比如int [] arr=new int[5];则有效下标为0-4
//        7.数组属引用类型，数组型数据是对象(object)
    }
}
