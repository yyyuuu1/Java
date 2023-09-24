package idea.chapter10.codeblock_;

/**
 * 演示代码块的细节1
 */
public class codeBlockDetail {
    public static void main(String[] args) {
        //1)static代码块也叫静态代码块，作用就是对类进行初始化，而且它随着类的加载而执行，并且只会执行一次。如果是普通代码块，每创建一个对象，就执行。

        //2)类什么时候被加载[重要背！]
        //1.创建对象实例时(new)
        //AA aa = new AA();//这句话就会导致AA类的静态代码块被执行

        //2.创建子类对象实例，父类也会被加载
        //AA aa1 = new AA();//因为AA继承了BB所以，会导致BB类的静态代码块也会被执行，并且是先执行父类的静态代码块

        //3.使用类的静态成员时（静态属性，静态方法） 使用子类的静态属性，也导致父类的加载
        //System.out.println(Cat1.n1);//使用了Cat1类的静态属性，也会导致Cat1类中的静态代码块被执行，并且我们继承了Animal类，因此会先执行父类的静态代码块，在到子类的静态代码块

        //static代码块，是在类加载时，执行的，而且只会执行一次.
        //只会执行一次静态代码块中的内容，因为静态代码块是发生在类加载的时候的，类只会加载一次，所以静态代码块只会执行一次
        //普通代码块是，每创建一个对象，就会调用一次
        //DD dd = new DD();
        //DD dd1 = new DD();

        //3)普通的代码块，在创建对象实例时，会被隐式的调用。
        // 被创建一次，就会调用一次。如果只是使用类的静态成员时，普通代码块并不会执行。
        System.out.println(DD.n1);//因为我们只是，使用DD类的静态属性，所以会导致类被加载，因此一定会执行静态代码块中的内容，因为我们并没有创建对象，所以普通代码块中的内容不会被执行

        //小结：
        //1.static代码块是类加载时，执行，只会执行一次*
        //2.普通代码块是在创建对象时调用的，创建一次，调用一次
        //3.类加载的3种情况，需要记住。
    }
}

class DD {
    public static int n1 = 8888;//静态属性

    //静态代码块
    static {
        System.out.println("DD 的静态代码块被执行...");//
    }

    //普通代码块, 在new 对象时，被调用，而且是每创建一个对象，就调用一次
    //可以这样简单的，理解 普通代码块是构造器的补充
    {
        System.out.println("DD 的普通代码块...");
    }
}

class Animal {
    //静态代码块
    static {
        System.out.println("Animal 的静态代码块被执行...");//
    }
}

class Cat1 extends Animal {

    public static int n1 = 999;//静态属性

    //静态代码块
    static {
        System.out.println("Cat 的静态代码块被执行...");//
    }
}

class BB {
    //静态代码块
    static {
        System.out.println("BB的静态代码块被执行");
    }
}

class AA extends BB {
    //静态代码块
    static {
        System.out.println("AA的静态代码块被执行");
    }
}