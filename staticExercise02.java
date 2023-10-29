package idea.chapter10.static_;

public class staticExercise02 {
}

class Person {  //StaticExercise02.java 2min 时间
    private int id;
    private static int total = 0;

    public static int getTotalPerson() {
        //id++;//错误, 注销

        return total;
    }

    public Person() {//构造器
        total++;  //total = 1
        id = total;//id = 1
    }
}

class TestPerson {
    public static void main(String[] args) {
        /*
        思路分析:
        第一次去调用方法的时候，此时total是0所以返回的值就是0
        第二次去调用方法的时候，因为先创建了一个Person对象,因此就回去执行Person类中的无参构造器
        所以total就会变成1 id也变成了1 然后在去调用方法的时候，那么返回的total就变成了1，所以最后输出的结果就是1
         */
        System.out.println( Person.getTotalPerson()); //0
        Person p1 = new Person();
        System.out.println( Person.getTotalPerson()); //1
    }
}