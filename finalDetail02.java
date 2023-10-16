package idea.chapter10.final_;

/**
 * 演示final关键字的细节2
 */
public class finalDetail02 {
    public static void main(String[] args) {
        /*
        5)一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法。
        6)final不能修饰构造方法(即构造器)
        7)final和 static 往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理。
        8)包装类(Integer,Double,Float，Boolean等都是final)，String也是final类
         */

        // 7)final和 static 往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理。 如果不加final使用num属性，会导致类的加载
        System.out.println(BBB.num);

        //包装类,String 是final类，不能被继承
    }
}


//final 和 static 往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理
class BBB {
    public final static int num = 10000;

    static {
        System.out.println("BBB 静态代码块被执行");
    }
}

final class AAA {
    //一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法
    //public final void cry() {}
}
