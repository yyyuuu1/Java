package com.objectOriented.homework;

public class homework03 {
    public static void main(String[] args) {
        // 3.编写类Book，定义方法updatePrice，
        // 实现更改某本书的价格，具体：如果价格>150，
        // 则更改为150，如果价格>100，更改为100，
        // 否则不变
        double price = 99;//定义书本的价格
        Book a = new Book();
        double b = a.updatePrice(price);
        System.out.println("更改之后的价格为" + b);

    }
}

class Book {
    public double updatePrice(double price) {

        if (price > 150) {
            price = 150;
        } else if (price > 100) {
            price = 100;
        }

        return price;
    }
}
//
//public class Test{
//    public static void 	main(String[] args){
//        // 3.编写类Book，定义方法updatePrice，
//        // 实现更改某本书的价格，具体：如果价格>150，
//        // 则更改为150，如果价格>100，更改为100，
//        // 否则不变
//        //
//        Book a=new Book("西游记",123);
//        a.info();
//        a.updatePrice();
//        a.info();
//    }
//}
//
//class Book{
//    String name;
//    double price;
//
//    public Book(String name,double price){//构造器
//        this.name=name;
//        this.price=price;
//    }
//
//    public void updatePrice(){//修改价格的方法
//        if(price>150){
//            price=150;
//        }else if(price>100){
//            price=100;
//        }
//    }
//
//    public void info(){//显示的方法
//        System.out.println(this.name+this.price);
//    }
//}

