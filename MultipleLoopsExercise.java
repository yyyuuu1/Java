package com.sequentialcontrol;

import java.util.Scanner;

/**
 * 演示多重循环例题
 */
public class MultipleLoopsExercise {
    public static void main(String[] args) {
        //1.统计三个班级成绩情况，每个班五个同学求各班级的
        //平均分和所有班级的平均分学生成绩从键盘输入
        //统计及格人数

        //思路分析
        //1.根据题目来看成绩需要我们从键盘输入，那么就是需要创建一个scanner对象用来输入成绩

        //创建一个scanner对象接受用户的输入
        Scanner scanner = new Scanner(System.in);

        double totalScore = 0;//该变量用用于存储所以班级的总成绩
        int count = 0;//统计几个的人数
        //因为是三个班级每个 班级五个学生，因此外层循环是3，内层循环是5
        for (int i = 1; i <= 3; i++) {
            double sum = 0;//该变量用于存储每个班级的总分
            for (int j = 1; j <= 5; j++) {
                System.out.println("第" + i + "个班第" + j + "个同学的成绩");
                double score = scanner.nextDouble();//接受输入的成绩
                if (score >= 60) {//如果输入的成绩，大于等于60说明成绩及格了，那么就count++统计几个的人数
                    count++;
                }
                //当内层循环结束后，sum存放就是第一个班级的总分，然后紧接着在退出到外层循环，输出每个班级的平均分，并把一个班级的总分累加到totalScore该变量是存放所有班级总分的。
                // 当一次循环结束后又重新把sum设置成了0，第二次的循环，统计的就是第二个班级学生的总分，这样当三层循环结束后，就完成了题目的要求
                sum += score;
            }
            System.out.println("第" + i + "个班级的平均分为" + sum / 5);//求每个班级的平均分
            totalScore += sum;//把每个班级的总分累加到，统计所有班级总分的变量中
        }
        System.out.println("所有班级的平均分为" + totalScore / 15);
        System.out.println("及格人数为" + count);
    }
}
