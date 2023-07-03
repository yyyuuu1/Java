package com.sequentialcontrol.if_;

import java.util.Scanner;

/**
 * 演示if-else 多分支
 */
public class if02 {
    public static void main(String[] args) {
        //1.多分支可以没有else 如果所有条件都不成立则一个入口都没有
        //比如
        //我们可以看到，多分枝的情况下，语法没有报错，因为我们的数字，没有满足两个条件表达式，因此不会输出任何一句话
        int n = 0;
        if (n > 0) {
            System.out.println("n大于0");
        } else if (n < 0) {
            System.out.println("n小于0");
        }

        //2.如果有else所有条件不成立默认执行else代码块
        //这里上面两个没有满足条件，那么就是默认直接执行else中的代码块，主要if语句之后执行一次，除非和循环搭配使用
        if (n > 0) {
            System.out.println("n大于0");
        } else if (n < 0) {
            System.out.println("n小于0");
        } else {
            System.out.println("n等于0");
        }


        //例子
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        if (n1 <= 1 && n1 >= 100) {//把输入数，返回控制在1-100之间，如果不满足这个条件，就直接执行else中的代码
            if (n1 == 100) {
                System.out.println("信用极好");
            } else if (n1 < 80 && n1 >= 99) {
                System.out.println("信用优秀");
            } else if (n1 <= 60 && n1 >= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        } else {
            System.out.println("请输入1到100之间的数");
        }
    }
}
