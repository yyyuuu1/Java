package com.variable.dataType;

public class floatDetail {
    public static void main(String[] args) {
        //1.浮点类型也有固定的字段长度和范围 不受操作系统运行单精度4个字节双精度8个字节

        //2.Java的浮点类型默认是double类型的声明float类型常量要在后面加f 或者 F
        //float num1 = 1.1; //错误,默认是double却赋值给float
        float num2 = 1.1F; //对的
        double num3 = 1.1; //对
        double num4 = 1.1f; //对 把float赋给double是可以的

        //3.一般情况下使用双精度因为比单精度更准确
        double num9 = 2.1234567851;
        float num10 = 2.1234567851F;
        System.out.println(num9);
        System.out.println(num10);

        //4.不要使用2.7和8.1/3进行比较，很危险8.1/3在计算机看来是一个近似于2.7的数

        //浮点数使用陷阱: 2.7 和 8.1 / 3  比较
        //看看一段代码
        double num11 = 2.7;
        double num12 = 2.7;    //8.1 / 3; //2.7
        System.out.println(num11);//2.7
        System.out.println(num12);//接近2.7的一个小数，而不是2.7
        //得到一个重要的使用点: 当我们对运算结果是小数的进行相等判断是，要小心
        //应该是以两个数的差值的绝对值，在某个精度范围类判断
        if (num11 == num12) {
            System.out.println("num11 == num12 相等");
        }
        //正确的写法 , ctrl + / 注释快捷键, 再次输入就取消注释
        if (Math.abs(num11 - num12) < 0.000000001) {
            System.out.println("差值非常小，到我的规定精度，认为相等...");
        }

        System.out.println(Math.abs(num11 - num12));
        //细节:如果是直接查询得的的小数或者直接赋值，是可以判断相等
    }
}
