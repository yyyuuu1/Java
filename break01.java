package com.sequentialcontrol.break_;

/**
 * 演示break的使用
 */
public class break01 {
    public static void main(String[] args) {
        //break一般出现在，循环，还有switch中
        //先来看看break的基本使用
        //这就是最简单的输出0-9之间的数字，但是现在增加一个需求，要求输出到5就结束循环，那么需要增加一个if判断即可
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }

        //还有一种使用的场景，配合死循环使用，比如,我要输出10句hello，word 但是我现在是死循环会一直输出，那么只需要在外面调用定义一个辅助变量即可
        int count = 0;
        for (; ; ) {//这就是一个死循环
            if (count == 10) {
                break;
            }
            System.out.println("hello,word");
            count++;
        }
    }
}
