package com.objectOriented.Method;

public class MethodExercise03 {
    public static void main(String[] args) {
        //创建一个Person1对象为Person1中的属性赋值
        Person1 p = new Person1();
        p.name = "jack";
        p.age = 10;

        //到此 p 和 p2是Person对象，但是是两个独立的对象，属性相同
        MyTools myTools = new MyTools();
        Person1 p2 = myTools.copyPerson(p);

        //到此 p 和 p2是Person对象，但是是两个独立的对象，属性相同
        System.out.println("p的属性 age=" + p.age + " 名字=" + p.name);
        System.out.println("p2的属性 age=" + p2.age + " 名字=" + p2.name);

        //对象克隆对象注意等到新对象和原来的对象是两个独立的对象，只是他们的属性相同
        //看看他们两个的hashCode就知道是不是同一个对象
        System.out.println(p.hashCode());//1163157884
        System.out.println(p2.hashCode());//1956725890
        //可以看到，两个对象的hashCode不相同，因此是两个不相同的对象
        System.out.println(p.equals(p2));//也可以使用equals方法比较，因为Person1 和myTools类都没有重写equals方法，因此默认调用的是Object的equals方法，判断的是两个对象的地址是否相同

    }
}

class Person1 {
    String name;
    int age;
}

class MyTools {
    public Person1 copyPerson(Person1 p) {
        //编写一个copyPerson 可以复制一个person对象，返回复制
        //对象克隆对象注意等到新对象和原来的对象是两个独立的对象，只是他们的属性相同

        //编写方法的思路
        //1. 方法的返回类型 Person
        //2. 方法的名字 copyPerson
        //3. 方法的形参 (Person p)
        //4. 方法体, 创建一个新对象，并复制属性，返回即可

        Person1 p2 = new Person1();//在创建一个Person1对象
        p2.name = p.name;//把原来对象的名字赋给p2.name
        p2.age = p.age;//把原来对象的年龄赋给p2.age
        return p2;//返回一个新的Person
    }
}
