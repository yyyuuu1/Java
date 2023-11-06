package idea.chapter10.signle_;

/**
 * 单例设计模式——懒汉式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        //懒汉式只有在用户需要的时候在创建，但是会有线程的问题
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance1 = Cat.getInstance();
        System.out.println(instance);

        //因为只会创建一次对象，下一次创建的时候，会返回上次创建的cat对象
        System.out.println(instance = instance1);

        /*
        思路分析：
        1.饿汉式，没有直接new对象，而是通过一个公共的static方法，进入方法中会先进行判断，当前对象是否为null 如果是null那么才创建，如果已经创建了则返回上一个对象
         */
    }
}

//步驟
//1.任然构造器私有化
//2.定义一个static静态属性对象
//3.提供一个public的static方法，可以返回一个Cat对象
//4.懒汉式，只有当用户使用getInstance()方法时，才返回cat对象, 后面再次调用时，会返回上次创建的cat对象，从而保证单例

class Cat {
    private String name;
    private static Cat cat;//静态属性对象  默认是空

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {//只有当用户调用getInstance方法时才会创建对象
        if (cat == null) {//因为第一次创建的时候cat是null，所以第二次在创建时cat已经不为null了所以第二次在创建的时候就是返回上一次创建的对象
            cat = new Cat("xiao");
        }
        return cat;
    }

    @Override
    public String toString() {//重写之后方便输出类的信息
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}