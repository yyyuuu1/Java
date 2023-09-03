package idea.chapter08.polymorphic.detail;

/**
 * 演示向上转型
 */
public class PolyDetail01 {
    public static void main(String[] args) {
        //向上转型: 父类的引用指向了子类的对象
        //语法：父类类型 引用名 = new 子类类型();

        /*
        这就是一个向上转型
        此时我们看，Animal animal = new Cat(); 这句话的编译类型和运行类型是什么
        还记得我们的话嘛，编译类型看=左边 运行类型看=右边
        编译类型是 Animal
        运行类型是 Cat
        语法：父类类型 引用名 = new 子类类型();
         */
        Animal animal = new Cat();
        Object obj = new Cat();//这样也是可以的，因为Cat是Animal的子类，而Animal是Object的子类，因此这样也是满足向上转型的语法

        //向上转型调用方法的规则如下:
        //(1)可以调用父类中的所有成员(需遵守访问权限)
        //可以调用父类中的属性，但是私有的属性不能够访问
        System.out.println(animal.name);
        System.out.println(animal.age);
        //System.out.println(animal.id);因为id属性是private的，因此不能直接访问会报错

        //看看方法  都可以调用父类中的方法（需要遵守访问权限，如果是私有的方法也不能访问，和调用属性的规则一样）
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

        //(2)但是不能调用子类的特有的成员
        //(#)因为在编译阶段，能调用哪些成员,是由编译类型来决定的
        //因为这是子类特有的方法，所以不能够去访问
        //animal.catchMouse();//错误的

        //(4)最终运行效果看子类(运行类型)的具体实现, 即调用方法时，按照从子类(运行类型)开始查找方法，然后调用，规则我前面我们讲的方法调用规则一致。
        //我们知道，在子类中也有一个eat()方法，该方法重写了父类的eat()方法，那么在使用animal去调用eat方法的时候，到底输出的是父类的方法呢，还是子类的方法
        //结果是子类的方法，因为最终运行起来，最后看的还是运行类型，而我们此时的运行类型是cat，那么在当程序运行起来
        animal.eat();


        //多态的向下转型
        //1)语法：子类类型 引用名= （子类类型)父类引用；
        //2)只能强转父类的引用，不能强转父类的对象
        //3)要求父类的引用必须指向的是当前目标类型的对象
        //4)当向下转型后，可以调用子类类型中所有的成员

        //只能强转父类的引用，不能强转父类的对象 这句话怎么理解我们看上面的这个代码    Animal animal = new Cat();
        //animal就是父类的引用，因为Animal是父类
        //所以向下转型就是 把animal强装成一个Cat
        Cat cat = (Cat) animal;
        //此时我们再来看编译类型和运行类型
        //编译类型是 Cat
        //运行类型是 Cat

        //向下转型后就可以去访问访问子类中的所以属性，但是也要遵守访问权限
        cat.catchMouse();//这样就不会报错了



    }
}
