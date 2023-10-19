package idea.chapter10.static_;

/**
 * 讲解static修饰符的基本使用
 */
public class static01 {
    public static void main(String[] args) {
        //什么是类变量
        //类变量也叫静态变量/静态属性，是该类的所有对象共享的变量，任何一个该类的对象去访问它时，取到的都是相同的值，同样任何一个该类的对象去修改它时，修改的也是同一个变量。
        //举例
        //如何演示，当一个属性变成静态属性之后，无论哪个类去访问该属性，访问到的都是同一个对象
        T.age--;//首先我们将age属性--，因为原来是10 ，减完之后就变成了9
        System.out.println(T.age);//因此在这里输出的时候，输出的就是9
        T.age--;//这里我们将age属性又--了，因为我们已经减过一次了所以在减一次 ，减完之后就变成了8
        //这里创建了一个方法，通过方法去访问，就是为了体现，当访问一个静态属性的时候，访问的都是同一个对象
        static01.test();//所以这里输出的时候就是8


        //如何访问类变量
        //类名.类变量名 或者 对象名.类变量名 【静态变量的访问修饰符的访问权限和范围 和 普通属性是一样的。】
        //推荐使用：类名.类变量名；

        //对象名.类变量名
        T t = new T();
        System.out.println(t.age);

        //类名.类变量名
        System.out.println(T.age);

        //也要遵守访问修饰符的权限,我们可以看到两种使用方式都不能访问私有的属性
        //System.out.println(T.name);
        //System.out.println(t.name);


        //说明：类变量是随着类的加载而创建，所以即使没有创建对象实例也可以访问
    }

    public static void test() {
        System.out.println(T.age);
    }
}

class T {
    //类变量的定义语法：
    //首先我们在T类中定义了一个静态属性，和平常定义的属性相比，只多了一个static，只需要使用static修饰符修饰的属性就是静态属性

    //访问修饰符 static 数据类型 变量名；[推荐]
    public static int age = 10;
    //static 访问修饰符 数据类型 变量名；
    static public double sum = 100;

    private static String name = "jack";
}

