package com.company;

public class ArrayDemo7 {
    public static void main(String[] args) {
        //定义数组
        int []  arr= {2,4,6,8,10};
        //定义临时变量
         int temp  =arr[0];
         //通过for循环获取比较
        for(int i = 0 ; i < arr.length; i++){
            //arr[i]表示的是数组中的每一个数据
           if( arr[i] > temp){
              temp = arr[i];
           }
        }
        //通过控制台来打印输出
        System.out.println("数组最大值为:" + temp);

    }
}
