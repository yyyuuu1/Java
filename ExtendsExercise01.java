package idea.chapter08.extends_.exercise;

/**
 * 演示继承的例题
 */

public class ExtendsExercise01 {
    public static void main(String[] args) {
        //题目在执行完 B b=new B();这句话之后会是输出什么
        B b = new B();//a , b name, b
        /*
        思路分析：
        1.首先使用创建了一个子类的对象，那么就先会调用在B类的无参构造器，我们之前在讲继承的时候说过，默认情况下都会有一个super();
          但是这里，我们的B类无参构造器中，已经写了this了就不会在有super了，因为我们知道this和super只能同时存在一个，所以呢
          this("abc");表示去调用B类（子类）的带一个参数的构造器，在B类(子类) 没有写this那么就说明，会有super 因此
          会先去执行A类（父类的）无参构造器 输出一个a 然后回到我们的B类（子类）的带一个参数的构造器 输出 b name
          然后在回到B类的 无参构造器，最后输出 b
          所以最终的输出的结果是a , b name, b
         */
    }
}

//class A {
//    A() {
//        System.out.println("a");
//    }
//
//    A(String name) {
//        System.out.println("a name");
//    }
//}
//
//class B extends A {
//    B() {
//        this("abc");
//        System.out.println("b");
//    }
//
//    B(String name) {
//        //默认有 super();
//        System.out.println("b name");
//    }
//}