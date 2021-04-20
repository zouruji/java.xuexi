package com.company;

public class dateGame {
    public static void main(String[] args) {
        //引用2个定义数组
        //定义arr1数组
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        //定义arr2数组
        int[] arr2 = arr1;
        arr2[2] = 44;
        System.out.println(arr1[2]);
        System.out.println(arr2[2]);
    }
}
