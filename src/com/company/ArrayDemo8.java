package com.company;

public class ArrayDemo8 {
    public static void main(String[] args) {
        //定义数组
        int [] arr={2,4,6,8,10,12,14};
        //调用方法
        printArray(arr);
    }
    //定义方法,用于打印数组
    public  static  void  printArray(int[] arr){
        for(int i = 0 ;i <arr.length; i ++){
            System.out.println(arr[i]);
        }
    }
}
