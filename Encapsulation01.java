package com.encap;

/*
那么在java中如何实现这种类似的控制呢？
请大家看一个小程序(com.hspedu.encap:Encapsulation01.java)，不能
随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理
就设置，否则给默认年龄，必须在1-120，年龄，工资不能直接查看，
name的长度在 2-6字符 之间
 */
public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(22);
        person.setSalary(12134);
        person.info();

        //如果直接使用构造器指定属性会绕过我们的设置的条件
        //解决办法把set方法写到构造器中
        Person person1 = new Person(12,"smith",1234);

    }
}

class Person {
    public int age;//公开的年龄
    private String name;//私有的名字
    private double salary;//私有的工资

    public Person() {

    }

    public Person(int age, String name, double salary) {
//        this.age = age;
//        this.name = name;
//        this.salary = salary;
        //可以把set方法写在构造器中
        setName(name);
        setSalary(salary);
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<1&&age>120) {
            this.age = age;
        }else{
            this.age=18;
            System.out.println("你输入的年龄有误给你设置一个默认年龄");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len=name.length();
        if(len>2&&len<6) {
            this.name = name;
        }else{
            this.name="无名";//刚默认的名字
            System.out.println("你输入的，名字有误");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void info(){
        System.out.println("name="+name+"\t"+"age="+age+"\t"+"salary="+salary);
    }

}