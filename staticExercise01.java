package idea.chapter10.static_;

public class staticExercise01 {
}

class Test {
    static int count = 9;

    public void count() {
        System.out.println("count=" + (count++));
    }

    /*
    思路分析：
    因为count是静态属性，所以在调用count方法的时候，因为是后++ 所以会先输出后++ 因此第一次输出的值就是9，注意的是在输出完之后，就自增了，编程了，所以
    我们第二此再去调用方法的时候，输出来的值已经是10了，然后还会在自增一次，变成了11，这时候再去使用this去访问，得到的值就是11
     */
    public static void main(String args[]) {
        new Test().count(); //9
        new Test().count(); //10
        System.out.println(Test.count);    //11
    }
}