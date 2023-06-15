package com.variable;

public class AutoConvertDetail {
    public static void main(String[] args) {
        //1.有多种类型的数据混合运算时，系统首先自动将所有数据 ;转换成容量最大的那种数据类型，然后再进行计算。
        int n1 = 10;
        //float d1 = n1 + 1.1;//错误 n1 + 1.1 => 结果类型是 double  因为1.1后面没有加f所以默认是double类型因此在计算完成后，得到的数据类型是double,把一个double赋给float会错
        //double d1 = n1 + 1.1;//对 n1 + 1.1 => 结果类型是 double   因为1.1后面没有加f所以默认是double类型因此在计算完成后，得到的数据类型是double,把一个double赋给double就正确
        float d1 = n1 + 1.1F;//对 n1 + 1.1 => 结果类型是 float  因为1.1后面加了f所以是float类型因此在计算完成后，得到的数据类型是float,把一个float赋给float正确

        //2.当我们把精度(容量)大 的数据类型赋值给精度(容量)小 的数据类型时，就会报错，反之就会进行自动类型转换。
        //int n2 = 1.1;//报错 把double->int

        //3.（byte   short)和char之间不会相互自动转换。
        byte b1 = 10; //对  , 因为byte的返回在-128-127，如果超出这个范围那么就会报错
        // int n2 = 1; //n2 是int
        // byte b2 = n2; //错误，原因： 如果是变量赋值，判断类型 尝试把一个int -> byte
        //
        // char c1 = b1; //错误， 原因 byte 不能自动转成 char


        //4.byte， short,char 他们三者可以计算，在计算时首先转换为int类型。
        byte n2 = 1;
        short n3 = 2;
        char n4 = 4;
        System.out.println(n2 + n3 + n4);//会将他们转化成int类型，在计算

        //5.boolean 不参与转换
//        boolean loop = false;
//        int n = loop;//错误

        //6.自动提升原则：表达式结果的类型自动提升为 操作数中最大的类型
        byte n5 = 1;
        short n6 = 100;
        int n7 = 1;
        float n8 = 1.1F;

        double num = n5 + n6 + n7 + n8; //float -> double  //因为最后num是double类型(n5 + n6 + n7 + n8)计算出来的结果是float类型，因为用来存放的num是double所以最终的数据类型double

    }
}
