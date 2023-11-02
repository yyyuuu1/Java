package idea.chapter10.static_;

/**
 * 演示静态方法的基本使用
 */
public class staticMethod01 {
    public static void main(String[] args) {
        //静态方法就不用创建对象实例，可以直接调用
        C.hi();
        C.say();
    }
}

class C {
    //类方法也叫静态方法。
    //形式如下：
    //访问修饰符 static 数据返回类型 方法名
    // static 访问修饰符 数据返回类型 方法名
    //类方法的调用：
    //使用方式：类名.类方法名 或者 对象名.类方法名 前提是 满足访问修饰符的访问权限和范围】

    //这就是一个静态方法，使用static关键字修饰后
    public static void hi() {
        System.out.println("hello , word ");
    }

    //这种写法也是对的
    static public void say() {

    }
}
