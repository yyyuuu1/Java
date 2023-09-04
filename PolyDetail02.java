package idea.chapter08.polymorphic.detail;

public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说！属性的值看编译类型

        //向上转型
        Base base = new son();
        /*
        这里输出的就是10，因为属性没有重写之说
        属性的值看编译类型  此时的编译类型是 Base  运行类型是 son
        所以此时输出的count就是10
         */
        System.out.println(base.count);

        son son = new son();
        /*
        这里输出的就是20，因为属性没有重写之说
        属性的值编译类型  此时的编译类型是 Base  运行类型是 son
        所以此时输出的count就是20
         */
        System.out.println(son.count);
    }
}

class Base {//父类
    int count = 10;
}

class son extends Base {//子类
    int count = 20;
}
