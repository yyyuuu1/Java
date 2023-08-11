package idea.chapter08.encapsulation;

/**
 * 演示封装的基本使用
 */
public class package01 {
    public static void main(String[] args) {
        //创建一个A的实例对象
        A a = new A();
        System.out.println(a.sum);
        //我们可以看到，在我们给name属性和age属性设置成私有属性之后，那么就不能在通过之前的方式去访问属性，这就是封装，我们不希望能够直接看到我们的名字和年龄就使用封装
        //那么应该然后去访问到已经被封装的属性呢，需要提供对应的get 和 set方法
        //通过这样的方式就可以输出信息，并且还可以修改信息
        a.setAge(1);//将年龄设置为1
        System.out.println(a.getAge());
        System.out.println(a.getName());

        //这样的方式是错误的
        //System.out.println(a.name);
        //System.out.println(a.age);
    }
}

class A {

    //定义了三个属性，
    int sum;
    private String name;
    private int age;

    //生成对应的get 和set 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
