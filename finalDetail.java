package idea.chapter10.final_;

import com.alibaba.druid.support.json.JSONUtils;

/**
 * 讲解final关键字的细节
 */
public class finalDetail {
    public static void main(String[] args) {
        /*
        1)final修饰的属性又叫常量，一般用XX XX XX来命名
        2)final修饰的属性在定义时，必须赋初值，并且以后不能再修改，赋值可以在如 下位置之一【选择一个位置赋初值即可】：
        1.定义时： 2.在构造器中 3.在代码块中。
        3)如果final修饰的属性是静态的，则初始化的位置只能是 代码块 1.定义时2.在静态代码块 不能在构造器中赋值。
        4)final类不能继承，但是可以实例化对象。
        5)如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承。
         */

        //final类可以实例化
        T2 t2 = new T2();

    }
}

class T {
    //2)final修饰的属性在定义时，必须赋初值，并且以后不能再修改，赋值可以在如 下位置之一【选择一个位置赋初值即可】：1.定义时： 2.在构造器中 3.在代码块中。
    //第一种方式直接赋值
    public final int AGE = 10;

    //第二种方式,在构造器中赋值
    public T() {
        //AGE = 20;
    }

    //第三种方法在代码块中赋值，因为AGE属性不是static的，所以不能使用static静态代码块来赋值，因为静态代码块只能访问静态属性
//    {
//        AGE = 30;
//    }
}

class T1 {
    //3)如果final修饰的属性是静态的，则初始化的位置只能是 代码块 1.定义时2.在静态代码块 不能在构造器中赋值。
    //第一种方式，直接赋值
    public static int TAX_RATE = 10;

    //第二种方式,在静态代码块中赋值
    static {
        TAX_RATE = 20;
    }

}

//4)final类不能继承，但是可以实例化对象。
final class T2 {

}


//5)如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承。
class T3 {
    public final void hi() {
        System.out.println("hi");
    }
}

class T4 extends T3 {

}
