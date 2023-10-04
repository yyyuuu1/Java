package idea.chapter10.codeblock_;

/**
 * 演示代码块的细节4
 */
public class codeBlockDetail04 {
    public static void main(String[] args) {

        //(1) 进行类的加载
        //1.1 先加载 父类 A02 1.2 再加载 B02
        //(2) 创建对象
        //2.1 从子类的构造器开始
        new B02();//对象
        /*
        思路分析：
        1.通过结论我们可以知道，在一个子类在继承了父类之后，再去创建子类对象的时候，会先去支持父类的静态代码块和静态属性，如果有多个静态代码块和静态属性，那么按照定义的顺序执行
          所以会先去执行父类的静态属性，因为在父类的第一行，因为父类的n1属性是同过getVal01()方法赋值，所以会输出第一句话(System.out.println("getVal01");) ,
          然后再去执行父类的静态代码块，所以就会输出第二句话(System.out.println("A02的一个静态代码块..");)

        2.然后再去执行子类的静态属性和静态代码块，因为子类的静态属性n3定义在第一行，所以会先执行n3属性,因为n3属性是通过getVal03()进行赋值，所以会输出第三局话(System.out.println("getVal03");)
          然后再去执行子类的静态代码块，因此会输出第四句话(System.out.println("B02的一个静态代码块..");)

        3.然后会去执行父类的普通代码块和普通属性的初始化，如果有多个普通属性和普通代码块他们的优先级一样，按照顺序去执行
          所以会去父类的普通代码块就会输出第五句话(System.out.println("A02的第一个普通代码块..");)
          然后再去初始化父类的普通属性，因为父类的普通属性是通过getVal02()赋值的，所以会输出第六句话( System.out.println("getVal02");)

        4.然后就是执行父类的构造器，也就是会输出第7句话(System.out.println("A02的构造器");)

        5.然后会去执行字类的普通代码块和普通属性的初始化，如果有多个普通属性和普通代码块他们的优先级一样，按照顺序去执行
          所以会先去初始化子类的普通普通属性，因为子类的普通属性是通过getVal04()赋值的，所以会输出第八句话(System.out.println("getVal04");)
          然后再去执行子类的普通代码块，就会输出第9句话也就是(System.out.println("B02的第一个普通代码块..");)

        6.最后会去执行子类的无参构造器，就会输出第10句话(System.out.println("B02的构造器");)
         */


        /*
        结论
        (6)我们看一下创建一个子类对象时（继承关系），他们的静态代码块，静态属性初始化，普通代码块，普通属性初始化，构造方法的调用顺序如下
        1.父类的静态代码块和静态属性（优先级一样，按定义顺序执行）
        2.子类的静态代码块和静态属性(优先级一样，按定义顺序执行)
        3.父类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
        4.父类的构造方法
        5.子类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行）
        6.子类的构造方法

        (7)静态代码块只能直接调用静态成员(静态属性和静态方法)，普通代码块可以调 用任意成员。
         */
    }
}

class A02 { //父类
    private static int n1 = getVal01();

    static {
        System.out.println("A02的一个静态代码块..");//(2)
    }

    {
        System.out.println("A02的第一个普通代码块..");//(5)
    }

    public int n3 = getVal02();//普通属性的初始化

    public static int getVal01() {
        System.out.println("getVal01");//(1)
        return 10;
    }

    public int getVal02() {
        System.out.println("getVal02");//(6)
        return 10;
    }

    public A02() {//构造器
        //隐藏
        //super()
        //普通代码和普通属性的初始化......
        System.out.println("A02的构造器");//(7)
    }

}

class B02 extends A02 { //

    private static int n3 = getVal03();

    static {
        System.out.println("B02的一个静态代码块..");//(4)
    }

    public int n5 = getVal04();

    {
        System.out.println("B02的第一个普通代码块..");//(9)
    }

    public static int getVal03() {
        System.out.println("getVal03");//(3)
        return 10;
    }

    public int getVal04() {
        System.out.println("getVal04");//(8)
        return 10;
    }

    //一定要慢慢的去品..
    public B02() {//构造器
        //隐藏了
        //super()
        //普通代码块和普通属性的初始化...
        System.out.println("B02的构造器");//(10)
        // TODO Auto-generated constructor stub
    }
}

// (7)静态代码块只能直接调用静态成员(静态属性和静态方法)，普通代码块可以调 用任意成员。
class C02 {
    private int n1 = 100;
    private static int n2 = 200;

    private void m1() {

    }

    private static void m2() {

    }

    static {
        //静态代码块，只能调用静态成员
        //System.out.println(n1);错误
        System.out.println(n2);//ok
        //m1();//错误
        m2();
    }

    {
        //普通代码块，可以使用任意成员
        System.out.println(n1);
        System.out.println(n2);//ok
        m1();
        m2();
    }
}