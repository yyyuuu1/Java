package com.sequentialcontrol.while_;

/**
 * 演示while循环的基本使用
 */
public class while01 {
    public static void main(String[] args) {
        //演示while循环的基本使用
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        //该循环就是输出1-100之间的数字，执行流程是先判断i的值是否小于100,如果满足条件进入循环，不满足则不会进入循环，程序会继续往下执行

        //这就是一个死循环，会一直输出
        while (true){
            System.out.println("hello,word");
        }
    }
}
