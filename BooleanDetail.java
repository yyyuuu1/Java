package com.variable.dataType;

public class BooleanDetail {
    public static void main(String[] args) {
        //Java里不可以用0或者非0的整数代替false 和true  这点和c语言不同
        //比如
        //在c语言中就可以，但是Java中不行
//        while (1){
//
//        }
        //这样就可以
        while (true) {
            int i = 0;
            System.out.println("hello" + (++i));
            if (i == 10) {
                break;
            }
        }
    }
}
