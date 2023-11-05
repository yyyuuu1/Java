package idea.chapter10.signle_;

/**
 * 演示单例设计模式——饿汉式
 */
public class SingleTon01 {
    public static void main(String[] args) {
        //因为没有将构造器私有化，所以创建出来的是两个对象，
//        GirlFriend xh = new GirlFriend("小红");
//        GirlFriend xb = new GirlFriend("小白");

        //通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);

        //即使我们创建了两个对象，因为我们将构造器私有化了，我们得到的对象，使用的都是提供的static方法，因此得到的两个对象都是相同的
        System.out.println(instance == instance2);//T
    }
}


//有一个类， GirlFriend，只能有一个女朋友
class GirlFriend {
    //一个私有的属性
    private String name;

    //为了能够在静态方法中，返回 gf对象，需要将其修饰为static，因为静态方法只能访问静态属性，不可以访问普通属性
    //在类中创建一个对象
    private static GirlFriend girlFriend = new GirlFriend("小花");
    //如何保障我们只能创建一个 GirlFriend 对象
    //步骤[单例模式-饿汉式]
    //1. 将构造器私有化
    //2. 在类的内部直接创建对象(该对象是static)
    //3. 提供一个公共的static方法，返回 GirlFriend对象

    private GirlFriend(String name) {
        this.name = name;
    }

    //提供一个公共的get方法返回GirlFriend对象
    public static GirlFriend getInstance() {
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
