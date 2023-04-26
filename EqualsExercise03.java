package com.object_;

public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相等？" + (it == fl));//T

        char ch1 = 'A';
        char ch2 = 12;
        System.out.println("65和‘A’是否相等？" + (it == ch1));//TSystem.out.println(“12和ch2是否相等？”+(12==ch2));//T

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1和str2是否相等？" + (str1 == str2));//F ==判断两个引用类型判断的是地址是否相同
        System.out.println("str1是否equals str2?" + (str1.equals(str2)));//T因为str1已经是字符串了所以重写了object的equals方法因此这里判断的是内容是不是相同
        //System.out.printin("hello"==new java.sql.Date());//类型不是同一类型 直接编译错误
    }
}
