package idea.chapter10.static_;

public class staticExercise03 {
    public static void main(String[] args) {

        Person1.setTotalPerson(3);
        new Person1(); //最后 total的值就是4
        Person1.m();//看看输出的是不是4
        /*
        思路分析：
        1.首先调用了Person类的静态方法，把total的值变成了3，然后new Person1()这句话会导致对象的创建
        就回去执行Person1的无参构造器，在无参构造器中total++，所以total的值就变成了4，又把total的值赋给了id
        所以id的值也是4，在去调用m()方法的是很好 total的值已经变成了4，所以最后输出的结果就是4
         */
    }
}

class Person1 {
    private int id;
    private static int total = 0;

    public static void setTotalPerson(int total) {
        // this.total = total;//错误，因为在static方法中，不可以使用this 关键字

        Person1.total = total;
    }

    public Person1() {//构造器
        total++;
        id = total;
    }

    //编写一个方法，输出total的值
    public static void m() {
        System.out.println("total的值=" + total);
    }
}

