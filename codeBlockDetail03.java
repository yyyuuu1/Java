package idea.chapter10.codeblock_;

/**
 * 演示代码块的细节3
 */

public class codeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();//(1)AAA的普通代码块(2)AAA() 构造器被调用(3)BBB的普通代码块(4)BBB() 构造器被调用

        /*
        思路分析：
        1.通过结论我们可以知道，在构造器最后，最前面其实隐含了super()和调用普通代码块，所以我们在执行new BBB();这句话之后，就会去执行BBB类的无参构造器
          因为BBB类的无参构造器中，隐含了super()和执行普通代码块，因为BBB继承了AAA所以会去执行AAA类的无参构造器，在AAA类的无参构造器中，也有隐藏的super和执行普通代码块
          因为AAA类的父类是Object所以没有继续执行父类的构造器，因此会先输出AAA类中的普通代码块中的内容(System.out.println("AAA的普通代码块");)，
          然后会去执行AAA类的无参构造器中的内容，也就是第二句话(System.out.println("AAA() 构造器被调用....");),
          在执行完父类的普通代码块后，和构造器之后，然后就会回到BBB类的无参构造器，所以会去执行BBB类的普通代码块，因为刚刚发生的内容都是在父类发生的，所以还要继续执行BBB类的普通代码块
          也就是第三句话(System.out.println("BBB的普通代码块...");),最后输出BBB类构造器中的内容，也就是第四句话( System.out.println("BBB() 构造器被调用....");)
         */

        //结论
        //5)构造方法（构造器)的最前面其实隐含了 super 和 调用普通代码块，静态相关的代码块，属性初始化，在类加载时，就执行完毕 ，因此是优先于 构造器和普通代码块执行的
    }
}

class AAA { //父类Object
    {
        System.out.println("AAA的普通代码块");//1
    }

    public AAA() {
        //(1)super()
        //(2)调用本类的普通代码块
        System.out.println("AAA() 构造器被调用....");//2
    }
}

class BBB extends AAA {
    {
        System.out.println("BBB的普通代码块...");//3
    }

    public BBB() {
        //(1)super()
        //(2)调用本类的普通代码块
        System.out.println("BBB() 构造器被调用....");//4
    }
}