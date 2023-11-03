package idea.chapter10.static_;

/**
 * 演示静态方法细节
 */
public class staticMethodDetail {
    public static void main(String[] args) {
        // 类方法使用细节和注意事项
        //1)类方法和普通方法都是随着类的加载而加载，将结构信息存储在方法区：类方法中无this的参数普通方法中隐含着this的参数
        //2)类方法可以通过类名调用，也可以通过对象名调用。
        //3)普通方法和对象有关，需要通过对象名调用，比如对象名.方法名(参数)，不能通过类名调用。
        T1.hi();//ok
        //非静态方法，不能通过类名调用
        //D.say();, 错误，需要先创建对象，再调用
        new T1().say();//可以
    }
}

class T1 {
    private int n1 = 100;
    private static int n2 = 200;

    public void say() {//非静态方法,普通方法

    }

    //静态方法,类方法
    public static void hi() {
        //类方法中不允许使用和对象有关的关键字，
        //比如this和super。普通方法(成员方法)可以。
        //在静态方法中使用this会报错
        //System.out.println(this.n1);
    }

    //类方法(静态方法)中 只能访问 静态变量 或静态方法
    //静态方法只能访问静态成员.
    public static void hello() {
        System.out.println(n2);
        System.out.println(T1.n2);
        //System.out.println(this.n2);不能使用
        hi();//OK
        //say();//错误 因为say方法不是静态方法
    }

    //普通成员方法，既可以访问  非静态成员，也可以访问静态成员
    //小结: 非静态方法可以访问 静态成员和非静态成员
    public void ok() {
        //非静态成员
        System.out.println(n1);
        say();
        //静态成员
        System.out.println(n2);
        hello();

    }
}
