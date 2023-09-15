package idea.chapter10.abstract_;

/**
 * 演示抽象类的注意事项和使用细节1
 */
public class abstractDetail01 {
    public static void main(String[] args) {
        /*
        抽象类的注意事项和使用细节
        1)抽象类不能被实例化
        2)抽象类不一定要包含abstract方法。也就是说，抽象类可以没有abstract方法
        3)一旦类包含了abstract方法，则这个类必须声明为abstract
        4)abstract只能修饰类和方法，不能修饰属性和其它的
         */

        //1)抽象类不能被实例化
        //此时AA是一个抽象类，因为抽象类不能被实例化，所以当我们想去实例化一个抽象类的时候就会报错
        //AA aa = new AA();//这是错误的
    }
}

//定义了一个抽象类
abstract class AA {
    //4)abstract只能修饰类和方法，不能修饰属性和其它的
    //abstract 只能修饰类和方法，不能修饰属性和其它的
    //abstract int n1;

    //abstract void hi();

    //2)抽象类不一定要包含abstract方法。也就是说，抽象类可以没有abstract方法
    //这样也是正确的
    public void say() {

    }
}

//一旦类包含了abstract方法,则这个类必须声明为abstract
abstract class C {
    public abstract void hi();
}