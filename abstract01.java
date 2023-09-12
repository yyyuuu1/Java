package idea.chapter10.abstract_;

/**
 * 演示抽象类的基本使用
 */
public class abstract01 {
    public static void main(String[] args) {
        /*
        什么是抽象类
        当父类的一些方法不能确定时，可以用abstract关键字来修饰该方法，这个方法就是抽象方法，用abstract来修饰该类就是抽象类。
        抽象类的基本介绍
        1)用abstract关键字来修饰一个类时，这个类就叫抽象类
        访问修饰符 abstract 类名{
        }
        2)用abstract关键字来修饰一个方法时，这个方法就是抽象方法访问修饰符 abstract 返回类型 方法名(参数列表)；//没有方法体
        3)抽象类的价值更多作用是在于设计，是设计者设计好后，让子类继承并实现抽象类()
         */
    }
}

/**
 * 注意当一个类中有一个方法是abstract修饰的，那么这个类就一定要是抽象类
 */

//这就是一个抽象类
abstract class A {

    //2)用abstract关键字来修饰一个方法时，这个方法就是抽象方法访问修饰符 abstract 返回类型 方法名(参数列表)；
    // 没有方法体
    public abstract void hi();
}


//继承A类
class B extends A {
    //重写父类的抽象方法
    @Override
    public void hi() {

    }


}


