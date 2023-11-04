package idea.chapter10.Interface;

/**
 * 演示继承和接口的区别
 */
public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wuKong = new LittleMonkey("猴子");
        wuKong.climbing();
        wuKong.swimming();
        wuKong.flying();
    }
}

//定义了一个猴子类
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + " 会爬树");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//定一个鱼的接口
interface Fish {
    void swimming();
}

//定一个鸟的接口
interface Bird {
    void flying();
}

//继承
//小结:  当子类继承了父类，就自动的拥有父类的功能
//      如果子类需要扩展功能，可以通过实现接口的方式扩展.
//      可以理解 实现接口 是 对java 单继承机制的一种补充.

//我们发现，当我们继承完Monkey类中，想要继续实现其他方法，就很难了，因为Java是单继承机制，因此我们可以通过实现接口的方法来完成
//我们的猴子本来只会爬树，但是在我们继承接口后，或者可以游泳，也可以飞翔
class LittleMonkey extends Monkey implements Fish, Bird {

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " 可以游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName() + " 可以飞翔");
    }
}