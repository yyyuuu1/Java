package idea.chapter10.Interface;

/**
 * 演示接口的基本使用
 */
public class interface01 {
    public static void main(String[] args) {
        /*
        接口就是给出一些没有实现的方法，封装到一起，到某个类要使用的时候，在根据具体情况把这些方法写出来。
        语法：
        interface 接口名{
        //属性
        //方法（1.抽象方法2默认实现方法3.静态方法）
        }
        class 类名 implements 接口 { 自己属性； 自己方法； 必须实现的接口的抽象方法
        }
        小结 1.在Jdk7.0前 接口里的所有方法都没有方法体，即都是抽象方法。 2.Jdk8.0后接口可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现
         */
    }
}

interface AA {
    //可以有属性还有方法
    //属性
    public int n1 = 10;

    //方法
    //在接口中，抽象方法，可以省略abstract关键字
    public void hi();

//小结
//1.在Jdk7.0前 接口里的所有方法都没有方法体，即都是抽象方法。
//2.Jdk8.0后接口可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现

    //在jdk8后，可以有默认实现方法,需要使用default关键字修饰
    default public void ok() {
        System.out.println("ok ...");
    }

    //在jdk8后, 可以有静态方法
    public static void cry() {
        System.out.println("cry ....");
    }
}


