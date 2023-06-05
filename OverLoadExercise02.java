package com.objectOriented.OverLode;

public class OverLoadExercise02 {
    public static void main(String[] args) {
        // 2. 在Methods类，定义三个重载方法max()，
        // 第一个方法，返回两个int值中的最大值，
        // 第二个方法，返回两个double值中的最大值，
        // 第三个方法，返回三个 double值中的最大值，
        // 并分别调用三个方法。
        Methods1 m = new Methods1();
        System.out.println(m.max(3, 4));
        System.out.println(m.max(1.2, 3.1));
        System.out.println(m.max(1.1, 1.2, 1.3));


    }
}

class Methods1 {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2, double n3) {
        double max = n1 > n2 ? n1 : n2;
        return max > n3 ? max : n3;
    }
}