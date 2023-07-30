package idea.chapter08.extends_;

/**
 * 演示继承的基本使用
 */
public class extends01 {
    public static void main(String[] args) {
        //创建一个Cat的实例对象
        Cat cat = new Cat("jack", 1, "111");
        //调用show()方法
        cat.show();
    }
}

//这是一个父类
class Animal {
    //定义了两个属性。一个是name 还有一个是age 属性
    String name;
    int age;

    //这是一个构造器
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //这是一个普通的方法
    public void show() {
        System.out.println(name + "\t" + age);
    }
}

//这是一个Cat类继承了Animal 注意当子类继承了父类就会自动拥有父类定义的属性和方法
class Cat extends Animal {
    //子类的属性
    String id;

    //子类的构造器
    public Cat(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    //重写了父类的show方法
    @Override
    public void show() {
        System.out.println("名字=" + name + "\t年龄=" + age + "\t编号=" + id);
    }
}