package idea.chapter10.static_;

/**
 * 讲解类变量在内存中的布局
 */
public class static02 {
    public static void main(String[] args) {
        /*
        思路分析：
        1.我们知道类变量只会加载一次，所以我们这里创建了两个对象的实例，通过对象实例去访问count这个属性，访问到的其实都是同一个对象,当然不推荐使用对象实例去访问静态属性
        2.static修饰的属性，在类加载的时候就已经完成了
         */
        Child child1 = new Child("jack");
        Child child2 = new Child("tom");
        child1.join();
        child2.join();
        System.out.println(child1.count);
        System.out.println(child2.count);
    }
}

class Child { //类
    private String name;
    //定义一个变量 count ,是一个类变量(静态变量)
    //该变量最大的特点就是会被Child 类的所有的对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " 加入了游戏..");
    }
}
