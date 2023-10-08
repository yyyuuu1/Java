package idea.chapter10.codeblock_;


public class codeBlockExercise02 {
    public static void main(String str[]) {
        Test a = new Test();//无参构造器
        //会先执行静态代码块和静态属性 然后在去执行非静态代码块和属性
        //再去先去调用Test()类的无参构造器 无参构造器中会有一个隐藏的super（）

        /*
        思路分析：
        1.我们创建了一个Test对象，就会导致类的加载，所以会先执行静态属性和静态代码块，因为Test类中有多个静态属性和静态代码块，因此按照顺序执行
          所以会先执行    static Sample sam = new Sample("静态成员sam初始化 "); 这句话 ，这句话执行了后，就会去执行Sample类的有参构造器
          会输出第一句话(System.out.println(静态成员sam初始化);)

        2.然后会去执行静态代码块中的内容，会输出第二句话(System.out.println("static块执行");) 因为我们在执行静态代码块的时候，已经创建了Sample对象
          所以此时再去判断 sam==null 不成立，所以就不会输出if语句中的内容

        3.然后再去执行普通属性和普通代码块的初始化，所以会执行      Sample sam1 = new Sample("sam1成员初始化"); 这句话，会导致去调用父类的有参构造器
          所以会输出第三局话(System.out.println(sam1成员初始化);)

        4.最后一步，执行子类的构造器，输出第四句话(System.out.println("Test默认构造函数被调用");)
         */
    }
}


class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample默认构造函数被调用");//
    }
}

class Test {
    Sample sam1 = new Sample("sam1成员初始化");//3
    static Sample sam = new Sample("静态成员sam初始化 ");//1

    static {
        System.out.println("static块执行");//2
        if (sam == null) System.out.println("sam is null");
    }

    Test() {//构造器
        System.out.println("Test默认构造函数被调用");//4
    }
}