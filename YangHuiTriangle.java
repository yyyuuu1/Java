package com.array;

/**
 * 二维数组的练习题 -> 杨辉三角
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
        /**
         * 注意二维数组的列一定要指定否则语法会报错
         */
        int arr[][] = new int[10][];//创建一个二维数组由于不确定每行的个数所以不指定大小
        for (int i = 0; i < arr.length; i++) {//遍历这个二维数组里有几个一维数组
            //第一行有一个元素第二行有2个元素第n行有n个元素
            //所以在开辟空间的时候用i+1因为i从0开始，因此这样刚好，开辟的大小，刚刚好和需要的长度相同
            //如果没有这句话的话，并没有给一维数组开辟空间，因为二维数组的本质是一维数组，我们在创建二维数组的时候也没有指定列的具体值，因此这里我们需要为一维数组开辟空间
            arr[i] = new int[i + 1];//给每个一维数组开辟空间如果不开辟空间默认为null
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length - 1) {//杨辉三角的第一列和最后一列都是1
                    arr[i][j] = 1;
                } else {
                    //剩下的情况是
                    //从第三行开始arr[i][j]=arr[i-1][j]+arr[i-1][j-1]
                    //这是规律必须找到
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}