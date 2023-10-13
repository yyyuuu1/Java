package idea.chapter10.final_;

/**
 * 演示final关键字的基本使用
 */
public class final01 {
    public static void main(String[] args) {
        /*
        final中文意思：最后的，最终的。
        final可以修饰类、属性、方法和局部变量.在某些情况下，
        1)当不希望类被继承时，可以用final修饰.
        2)当不希望父类的某个方法被子类覆盖/重写(override)时，可以用final关键字修饰。
        3)当不希望类的的某个属性的值被修改，可以用final修饰.
        4)当不希望某个局部变量被修改，可以使用final修饰
         */

        F f = new F();
        f.cry();
    }
}

//1)当不希望类被继承时，可以用final修饰.
//因为A被final修饰了，因此不可以在被继承，所以B继承A会报错
final class A {
}

//class B extends A {}

class C {
    //2)当不希望父类的某个方法被子类覆盖/重写(override)时，可以用final关键字修饰。
    public final void hi() {
    }
}

class D extends C {
    //此时，子类在去重写父类的方法，就会报错，因为父类中的方法是final修饰，因为被final修饰后就不能够在重写了
//    @Override
//    public void hi() {
//        System.out.println("重写了C类的hi方法..");
//    }
}

//当不希望类的的某个属性的值被修改,可以用final修饰,如果修改了final修饰的属性，就会报错
class E {
    public final double TAX_RATE = 0.08;
}

//当不希望某个局部变量被修改，可以使用final修饰
class F {
    public void cry() {
        //这时，NUM 也称为 局部常量
        final double NUM = 0.01;
        //NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }
}

