package com.objectOriented.Method;

public class MethodExercise02 {
    public static void main(String[] args) {
        //根据行列字符打印对应的行数列数和字符
        BB bb = new BB();
        bb.print(4, 4, '@');
    }
}

class BB {
    /**
     * 该方法根据用户传入的数字和字符来决定要输出几行几列
     *
     * @param row 表示行
     * @param col 表示列
     * @param c   表述输出的字符是什么
     */
    public void print(int row, int col, char c) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
