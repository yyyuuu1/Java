package com.sequentialcontrol.dowhile_;

public class doWhileExercise {
    public static void main(String[] args) {
        //统计1到200之间能被5整除不能被3整除的数
        int i = 1;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 200);
    }
}
