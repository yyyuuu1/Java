package idea.chapter10.codeblock_;

/**
 * 演示代码块的基本使用
 */
public class codeBlock01 {
    public static void main(String[] args) {
        /*
        基本介绍
        代码化块又称为初始化块，属于类中的成员[即 是类的一部分]，类似于方法，将逻辑语句封装在方法体中，通过{}包围起来。
        但和方法不同，没有方法名，没有返回，没有参数，只有方法体，而且不用通过对象或类显式调用，而是加载类时，或创建对象时隐式调用。
        */

        //怎么理解代码块是什么，我们看到，在Cat类中我们定义了三个构造器，这三个构造器中，都输出了两个相同的话
        //我们在代码块的基本介绍中看到了，代码块是在加载类的时候，或者创建对象的时候隐式调用，
        //定义了代码块之后，不管创建那个对象，都会先调用代码块中的内容

        //因为实在加载类的时候调用的，所以我们只要创建了一个对象，那么就会导致，代买快中的内容被执行
        Cat cat = new Cat();

    }
}


//创建了一个Cat类
class Cat {
    //定义了两个私有属性
    private String name;
    private int age;

    //(1) 我们可以看到下面的三个构造器都有相同的语句
    //(2) 这样代码看起来比较冗余
    //(3) 这时我们可以把相同的语句，放入到一个代码块中，即可
    //(4) 这样当我们不管调用哪个构造器，创建对象，都会先调用代码块的内容
    //(5) 代码块调用的顺序优先于构造器..

    {
        System.out.println("猫在叫");
        System.out.println("猫在吃饭");
    }

    //无参构造器
    public Cat() {
//        System.out.println("猫在叫");
//        System.out.println("猫在吃饭");
    }

    //带两个参数的构造器
    public Cat(String name, int age) {
//        System.out.println("猫在叫");
//        System.out.println("猫在吃饭");
        this.name = name;
        this.age = age;
    }

    //带一个参数的构造器
    public Cat(String name) {
//        System.out.println("猫在叫");
//        System.out.println("猫在吃饭");
        this.name = name;
    }
}
