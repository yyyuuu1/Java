package idea.chapter10.static_;

/**
 * 演示static修饰符的注意事项和使用细节
 */
@SuppressWarnings({"all"})
public class staticDetail {
    public static void main(String[] args) {

        //2.类变量与实例变量(普通属性)区别 类变量是该类的所有对象共享的，而实例变量是每个对象独享的。
        //如果演示这句话类变量是该类的所有对象共享的看演示
        Student student = new Student();
        Student student1 = new Student();
        //这就是两个不同对象去访问静态属性，访问到的都是同一个，同一块空间
        System.out.println(student1.fee);
        System.out.println(student.fee);


        //4.类变量可以通过 类名.类变量名 或者 对象名.类变量名 来访问，但java设计者推荐我们使用 类名.类变量名方式访问。
        //推荐这种方式
        System.out.println(Student.fee);
        //不推荐这种方式
        //System.out.println(student.fee);

        //5.实例变量不能通过 类名.类变量名 方式访问。
        //我们在A类中有一个实例变量，试试看能不能按照类变量的访问方式去访问实例属性
        //System.out.println(A.age);//这样是错误的，访问实例变量需要创建对象实例

        //6.类变量是在类加载时就初始化了，也就是说，即使你没有创建对象，只要类加载了，就可以使用类变量了。
        //7.类变量的生命周期是随类的加载开始，随着类消亡而销毁

    }
}

//这是一个学生类
class Student {
    //1.什么时候需要用类变量 当我们需要让某个类的所有对象都共享一个变量时，就可以考虑使用类变量(静态变量)：比如：定义学生类，统计所有学生共交多少钱。Student (name, static fee)
    //这是学费
    //在实际情况中，一个学校收取学费，肯定是收到同一个账户上的，所以可以该变量设置成static修饰的，这样大家都是同一的交的一个账户上，不容易出错
    public static double fee = 20;

}

class A {
    //3.加上static称为类变量或静态变量，否则称为实例变量/普通变量/非静态变量
    public static double sum = 10;//类变量或静态变量
    public int age = 100;//实例变量/普通变量/非静态变量

}


