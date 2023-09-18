package idea.chapter10.abstract_;

/**
 * 演示抽象类的习题
 */
public class abstractExercise {
    public static void main(String[] args) {
//        4)编写一个Employee类，声明为抽象类，包含如下三个属性：name，id，salary。
//        提供必要的构造器和抽象方法：work()。对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
//        请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问，实现work()，提示“经理/普通员工 名字 工作中....”

        Manager manager = new Manager("jack", 10, 1000);
        manager.work();

        CommonEmployee tom = new CommonEmployee("tom", 20, 100);
        tom.work();


    }
}
