package idea.chapter08.super_;

/**
 * 演示super关键字的基本使用
 */
public class super01 {
    public static void main(String[] args) {
        //super关键字的作用
        //super代表父类的引用，用于访问父类的属性、方法、构造器

        //基本语法
        //1.访问父类的属性，但不能访问父类的private属性  super.属性名；
        //2.访问父类的方法，不能访问父类的private方法  super.方法名(参数列表)；
        //3.访问父类的构造器(这点前面用过):  super(参数列表)；只能放在构造器的第一句，只能出现一句！

        Dog dog = new Dog();
        System.out.println();
        Dog dog1 = new Dog("jack");

        //dog.hi();
    }
}

class Animal {//父类
    //私有的名字属性
    private String name;
    //公有的年龄属性
    public int age;

    //有参构造器
    public Animal(String name, int age) {
        System.out.println("父类的有参构造器被调用");
        this.name = name;
        this.age = age;
    }

    //无参构造器
    public Animal() {
        System.out.println("父类的无参构造器被调用");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cry(String name) {
        System.out.println("hello,word" + " " + name);
    }
}

class Dog extends Animal {

    public Dog() {
        //3.访问父类的构造器(这点前面用过):  super(参数列表)；只能放在构造器的第一句，只能出现一句！
        super();//表示去访问父类的无参构造器
        //这样是错误的，只能有一个super，并且只能出现在构造器中的第一行，否则会报错
        //super("jack",10);
        System.out.println("子类的无参构造器被调用");
    }

    public Dog(String name) {
        super("jack", 10);//表示去访问父类的有参构造器
        System.out.println("子类的带一个参数有参构造器被调用");
    }

    public void hi() {
        //1.访问父类的属性，但不能访问父类的private属性  super.属性名；
        //可以访问父类的public属性
        System.out.println(super.age);
        //这样是错误的，不可以访问父类的private属性
        //System.out.println(super.name);
        //如果想要访问父类的私有属性，需要调用父类提供的公共方法
        System.out.println(super.getName());


        //2.访问父类的方法，不能访问父类的private方法  super.方法名(参数列表)；
        //使用super去访问父类的方法,同理如果方法是私有的也不能直接访问，需要父类提供公共的方法才可以
        super.cry("jack");


    }
}

