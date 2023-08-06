package idea.chapter08.extends_;

/**
 * 讲解继承的本质
 */
public class extendsEssence {
    public static void main(String[] args) {
        //创建了一个Son对象
        Son son = new Son();
        // -> 表示继承
        //此时类的继承关系是  son -> father -> grandpa -> Object (不要忘记了，还有一个Object)
        //(1) 首先看子类是否有该属性
        //(2) 如果子类有这个属性，并且可以访问，则返回信息
        //(3) 如果子类没有这个属性，就看父类有没有这个属性(如果父类有该属性，并且可以访问，就返回信息..)
        //(4) 如果父类没有就按照(3)的规则，继续找上级父类，直到Object...

        //这里我们使用 son这个对象实例去访问name属性 因为在son类中有name属性，那么输出的就是son中的name ， 如果son中没有name 那么就会去到父类中去查找，以此类推
        System.out.println(son.name);//返回就是大头儿子

        //因为我们在son类中没有age属性，就会去父类找，虽然在父类上找到了，但是是私有属性的不能够直接访问，如果直接访问会报错，因此需要调用公共的方法来解决
        //System.out.println(son.age);//返回的就是39
        //System.out.println(son.getAge());//返回的就是39

        //因为在son 类 和father类中 都没有hobby属性一直向上找到了，grandPa 才找到，如果一直会报错
        System.out.println(son.hobby);//返回的就是旅游
    }
}

class GrandPa { //爷类
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {//父类
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father { //子类
    String name = "大头儿子";
}