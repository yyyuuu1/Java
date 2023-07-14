package com.sequentialcontrol.while_;

/**
 * 打印空心金字塔
 */
public class start {
    public static void main(String[] args) {
        //思路分析
        //1.我们先从最简单的开始，打印一个金字塔

        int n = 5;//定义金子塔的行数
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2.因为是打印空心金字塔，只需要在内存循环中，增加if条件判断即可 根据规律我们知道，只有每一行的第一列和最后一列都是*号，还有最后一行也都是*号，
        //那么只需要增加if条件判断 判断只有第一列和最后一列和最后一行都是*号，其他都输出空格，这样即可完成效果
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k <= n - i; k++) {//该循环是用来输出，*号之前的空格的规律正好是行数n减去i
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {//就是输出*号
                if (j == 1 || i == n || j == 2 * i - 1) {//根据条件
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
