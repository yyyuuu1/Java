package idea.chapter08.polymorphic.detail;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof  BB);// true
        System.out.println(bb instanceof  AA);// true

        //aa 编译类型 AA, 运行类型是BB
        //BB是AA子类
        AA aa = new BB();
        //看的是运行类型 此时aa的运行类型是BB 而BB是AA的子类，所以他们是同一个对象
        System.out.println(aa instanceof AA);
        //看的是运行类型 此时aa的运行类型是BB 而BB就是BB，所以他们是同一个对象
        System.out.println(aa instanceof BB);

        //obj 编译类型 Object ， 运行类型是 Object
        Object obj = new Object();
        //看的是运行类型 此时obj的运行类型是Object 而obj不是AA的子类，所以他们不是同一个对象
        System.out.println(obj instanceof AA);//false
        String str = "hello";
        //System.out.println(str instanceof AA);
        //因为String是Object的子类所以返回true
        System.out.println(str instanceof Object);//true
    }
}

class AA {

}

class BB extends AA {

}
