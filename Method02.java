package com.objectOriented.Method;

/**
 * 演示方法带来的便利
 */
public class Method02 {
    public static void main(String[] args) {
        //为什么需要成员方法
        //有一个需求： int[][] map = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        //请遍历一个二维数组，输出数组的各个元素值。
        //解决思路1，传统的方法，就是使用单个for循环，将数组输出
        //解决思路2：定义一个类T2，然后写一个成员方法，调用方法实现，看看效果又如何。

        //如果我连续三次输出这个数组，那么就需要三个for循环
        int[][] map = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};

        //使用方法只需要调用三次方法即可
        //改进之后只需要调用三次方法就可以实现3次数组的遍历而如果继续使用传统方法的话则需要
        //三次遍历，方法大大提高了代码的可读性
        T2 t2 = new T2();//创建一个对象
        t2.TraversalArray(map);
        t2.TraversalArray(map);
        t2.TraversalArray(map);

//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}


//使用方法来解决
class T2 {
    public void TraversalArray(int[][] map) {//该方法用于对数组进行排序
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
