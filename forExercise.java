package com.sequentialcontrol.for_;

public class forExercise {
    public static void main(String[] args) {
        //练习
        //输出1-100之间不能被5整除的数每五个一行
        int count = 0;
        for (int i = 1; i <= 100; i++) {//输出1-100之间的所以数
            if (i % 5 != 0) {//这里的条件判断是用来判断是否能被5整除，如果满足条件就输出
                System.out.print(i + " ");
                count++;//定义一个变量，因为要每5个换一行输出，所以还要对count进行判断
                if (count % 5 == 0) {//如果count%5==0,条件成立，说明我们的一行已经有五个数字了，在输出一个换行即可
                    System.out.println();
                }
            }
        }

        //打印乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
