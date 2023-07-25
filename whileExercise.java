package com.sequentialcontrol.while_;

/**
 * 演示while循环的例题
 */
public class whileExercise {
    public static void main(String[] args) {
        //最基本的例题
        //打印1到100之间能被3整除的数
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        //打印40-200之间所有的偶数
        int j = 40;
        while (j <= 200) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }

    }
}
