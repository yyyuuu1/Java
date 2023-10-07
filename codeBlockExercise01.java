package idea.chapter10.codeblock_;


public class codeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total = " + Person.total); //100
        System.out.println("total = " + Person.total); //100
        /*
        思路分析：
        1.因为使用类的静态属性会导致类的加载，所以在我们第一次使用Person.total的时候，就会先去执行静态代码块，在静态代码块中给total赋值了100
          然后在输出(System.out.println("in static block!");)这句话，然后就是输出total的值，第二次在一次输出total的时候，不会再输出其他内容
          只会输出total的值，因为类的加载只会发生一次
          因此最后输出的内容就是
          in static block!
          total = 100
          total = 100

        重点
        2)类什么时候被加载
        1.创建对象实例时
        2.创建子类对象实例，父类也会被加载
        3.使用类的静态成员时（静态属性，静态方法）
         */
    }
}

class Person {
    public static int total;//静态变量

    static {//静态代码块
        total = 100;
        System.out.println("in static block!");//(1)
    }
}

