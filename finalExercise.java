package idea.chapter10.final_;

/**
 * final关键字习题
 */

public class finalExercise {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.print();
    }
}

class Circle {
    private double radius;
    //第一种方式直接赋值
    private final double PI = 3.14;

    //final修饰的变量可以在  定义时赋值   可以在构造器中赋值    可以在代码块中赋值
    //第二种方式构造器中赋值
    public Circle(double radius) {
        this.radius = radius;
        //PI=3.14;
    }

    //第三种方式代码块中赋值
//    {
//        PI=3.14;
//    }

    public void print() {
        System.out.println("面积为：" + radius * radius * PI);
    }
}