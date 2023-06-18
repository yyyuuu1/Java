package com.sequentialcontrol.break_;

import java.util.Scanner;

/**
 * 演示break例题
 */
public class breakExercise {
    public static void main(String[] args) {
        //例题
        //完成一个简易的登录程序
        Scanner scanner = new Scanner(System.in);//创建一个scanner对象接受用户的输入

        int n = 3;//只有三次的登录机会
        for (int i = 1; i <= 3; i++) {//因为一个只有三次，因此循环3次
            System.out.println("请输入用户的名字");
            String name = scanner.next();
            System.out.println("请输入用户的密码");
            String password = scanner.next();
            //这里建议使用"小明".equals(name)这种方式来判断字符串是否相等，可以避免空指针的问题
            if ("小明".equals(name) && "123456".equals(password)) {
                System.out.println("登入成功");
                //如果登录成功，那么就直接跳出循环
                break;
            } else {
                //这里就是登陆失败的情况了
                n--;//首先对总登录次数--，然后提示信息
                System.out.println("输入的用户名或者密码有误请重新输入");
                System.out.println("还剩下" + n + "次机会");
                if (n == 0) {//在判断用户是否把登录次数用光了，如果登录次数为0了说明，登录次数用完了，也跳出循环
                    System.out.println("登入次数用光不允许登录");
                    break;
                }
            }
        }
    }
}
