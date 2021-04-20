package com.company;

public class Main {

    public static void main(String[] args) {
//        for(;;){
//            System.out.println("死循环");
//        }
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        while (true) {
            System.out.println("死循环获取数组:" + arr[2]);
        }
    }
}
