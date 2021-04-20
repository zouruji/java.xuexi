package com.company;

import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args) {
        //需求:键盘录入两个数字,比较他们是否相同.
        Scanner sc = new  Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int num2 = sc.nextInt();
        //调用方法:
        boolean is =compare (num1 , num2);
        System.out.println(is);
    }

    public static boolean compare(int a, int b) {

        //原始做法:
         /* boolean  c = ( a == b);
         return c;
         */
        return a == b;
    }

}
