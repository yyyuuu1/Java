package com.sequentialcontrol.switch_;

import java.util.Scanner;

/**
 * switch练习
 */
public class switchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //使用switch把小写的char型转为大写（键盘输入）
        char c1 = scanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("你的输入有误");
        }


        //根据用于指定月份，打印该月份所属的季节。3，4，5春季6，7，8夏季 9,10,11
        System.out.println("请输入月份");
        int date = scanner.nextInt();
        //这里我们知道3 4 5 都是春季，那么就不要每一个case后面都写，利用case后面不带break，会自动执行完之后的代码的特性
        switch (date) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("请输入正确的月份呢");

        }
    }
}
