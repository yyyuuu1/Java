package idea.chapter08.encapsulation;

/**
 * 封装例题1
 */
public class packageExercise01 {
    public static void main(String[] args) {
        /*
        不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理
        就设置，否则给默认年龄，必须在1-120，年龄，工资不能直接查看，
        name的长度在 2-6字符 之间
         */

        //我们可以看到，使用这种方式，确实控制住了，并且可以提示相应的信息，但是这种写法还是有个缺陷
        Person person = new Person();
        person.setAge(1);
        person.setName("jack");
        person.setAge(1000);
        System.out.println(person);

        //换行
        System.out.println();

        //我们在Person类中有一个有三个参数的构造器，如果使用构造器进行初始化，那么我们下面的判断就全部失效了
        //因为构造器在初始化的时候，是发生在类加载的时候，根本没有使用到set方法去设置属性，所以我们写的方法就完全拦截不住
        //看测试
        Person p = new Person(10000, 2, "hello,word");
        //可以看到使用这种方式，完全没有控制住，那么解决办法是什么呢，就是把set方法写道构造器中，这样就又可以实现了
        System.out.println(p);//注意这样的写法等价于 System.out.println(p.toString());
        //p.show();

    }
}

//创建一个Person类
class Person {
    //把人的年龄，名字，工资，进行封装
    private int age;
    private double salary;
    private String name;

    public Person() {

    }

    public Person(int age, double salary, String name) {
//        this.age = age;
//        this.salary = salary;
//        this.name = name;

        //把set方法写入到构造器中，就又实现了效果
        setAge(age);
        setSalary(salary);
        setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //根据题目的要求，年龄需要在1-120之间否则就给默认值，因此在这里我们进行判断
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            //年龄不在1-120之间
            System.out.println("您输入的年龄不在1-120之间");
            this.age = 0;//设置默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //根据题目的要求，名字需要在2-6个字符之间否则就给默认值，因此在这里我们进行判断
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            //名字的长度不在 2-6之间，所以给默认的值
            System.out.println("您输入的名字长度不在2-6之间");
            this.name = null;
        }
    }

    //如果看不懂重写toString()方法，可以单独在写一个专门方法
    public void show() {
        System.out.println("年龄=" + age + "\t名字=" + name + "\t工资=" + salary);
    }

    //重写一个toString方法，这样我们在直接输出这个Person类信息的时候，会自动的调用toString方法
    @Override
    public String toString() {
        return "年龄=" + age + "\t名字=" + name + "\t工资=" + salary;
    }
}
