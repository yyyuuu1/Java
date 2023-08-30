package idea.chapter08.super_;

/**
 * 演示super关键字的注意事项和使用细节
 */
public class superDetail {
    public static void main(String[] args) {
        //1.调用父类的构造器的好处（分工明确，父类的属性由父类初始化，子类的属性由子类初始化）
        //2.当子类有和父类中的成员（属性和方法）重名是，为了访问父类的成员，必须通过super，通过没有重写，使用super、this 直接方法也是一样的效果
        //3.super的访问不限于父类，如果爷爷类和本类都有同名的成员，也可以使用super去访问爷爷类的成员：如果多个基类（上级类）中都有同名的成员，使用super方法遵守就近原则

        B b = new B();
        b.test();
    }
}

class Base { //父类是Object

    public int n1 = 999;
    public int age = 111;

    public void cal() {
        System.out.println("Base类的cal() 方法...");
    }

    public void eat() {
        System.out.println("Base类的eat().....");
    }
}

class A extends Base {
    //4个属性 不同权限的属性
    //public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //无参构造器
    public A() {
    }

    //带一个参数的构造器
    public A(String name) {
    }

    //带两个参数的构造器
    public A(String name, int age) {
    }

//    public void cal() {
//        System.out.println("A类的cal() 方法...");
//    }

    //四个不同权限的方法
    public void test100() {
    }

    protected void test200() {
    }

    void test300() {
    }

    private void test400() {
    }
}

class B extends A {

    public int n1 = 888;

    //编写测试方法
    public void test() {
        //super的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用super去访问爷爷类的成员；
        // 如果多个基类(上级类)中都有同名的成员，使用super访问遵循就近原则。A->B->C

        System.out.println("super.n1=" + super.n1);//super表示去访问父类的成员，因为在我们的父类中n1所以输出的也就是父类中的n1
        System.out.println(this.n1);//如果使用的是this，那么输出的就是本类中的属性，如果本类中没有这个属性，那么就回去父类中查找，规则一样

        super.cal();
    }

    //访问父类的属性 , 但不能访问父类的private属性 [案例]super.属性名
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    public void cal() {
        System.out.println("B类的cal() 方法...");
    }

    public void sum() {
        System.out.println("B类的sum()");
        //希望调用父类-A 的cal方法
        //这时，因为子类B没有cal方法，因此我可以使用下面三种方式

        //找cal方法时(cal() 和 this.cal())，顺序是:
        // (1)先找本类，如果有，则调用
        // (2)如果没有，则找父类(如果有(遵守访问修饰符的权限)，并可以调用，则调用)
        // (3)如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 Object类
        // 提示：如果查找方法的过程中，找到了，但是不能访问， 则报错, cannot access
        //      如果查找方法的过程中，没有找到，则提示方法不存在
        //cal();
        this.cal(); //等价 cal()

        //找cal方法(super.call()) 的顺序是直接从父类开始查找，其他的规则一样
        //super.cal();

        //演示访问属性的规则
        //n1 和 this.n1 查找的规则是
        //(1) 先找本类，如果有，则调用
        //(2) 如果没有，则找父类(如果有，并可以调用，则调用)
        //(3) 如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 Object类
        // 提示：如果查找属性的过程中，找到了，但是不能访问， 则报错, cannot access
        //      如果查找属性的过程中，没有找到，则提示属性不存在
        System.out.println(n1);
        System.out.println(this.n1);

        //找n1 (super.n1) 的顺序是直接查找父类属性，其他的规则一样
        System.out.println(super.n1);

    }

    //访问父类的方法，不能访问父类的private方法 super.方法名(参数列表);
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400();//不能访问父类private方法
    }

    //访问父类的构造器(这点前面用过)：super(参数列表);只能放在构造器的第一句，只能出现一句！
    public B() {
        //super();
        //super("jack", 10);
        super("jack");
    }
}



