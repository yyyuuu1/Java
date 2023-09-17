package idea.chapter10.abstract_;

/**
 * 演示抽象类的注意事项和使用细节2
 */
public class abstractDetail02 {
    public static void main(String[] args) {
        /*
        5)抽象类可以有任意成员【因为抽象类还是类】，比如：非抽象方法、构造器、静态属性等等
        6)抽象方法不能有主体，即不能实现.
        7)如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为abstract类。[举例 A类，B类，C类]
        8)抽象方法不能使用private、final和 static来修饰，因为这些关键字都是和重写相违背的。
         */
    }
}

abstract class BB {
    //5)抽象类可以有任意成员【因为抽象类还是类】，比如：非抽象方法、构造器、静态属性等等
    private String name;
    private int age;

    //静态属性
    private static double sum;

    //构造器
    public BB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //非抽象方法
    public void hi() {

    }

    //抽象方法不能有主体，即不能实现
    //这样是错误的，不能实现
//    abstract void say(){
//        System.out.println();
//    }

    //这样才是正确的
    abstract void say();

}

//因为cc继承了BB类所以需要实现BB类中的抽象方法
class CC extends BB {

    public CC(String name, int age) {
        super(name, age);
    }

    @Override
    void say() {

    }
}

//如果类的本身就是抽象方法就不用实现父类的抽象方法
abstract class DD extends BB {

    public DD(String name, int age) {
        super(name, age);
    }
}

//抽象方法不能使用private、final和 static来修饰，因为这些关键字都是和重写相违背的。
abstract class EE {
    abstract public void hi01();

    abstract protected void hi02();

    abstract void hi03();

    //这个是错误的，不用使用private,final,static修饰
    //abstract private void hi04();
    //abstract static void hi05();
    //abstract final void hi06();
}
