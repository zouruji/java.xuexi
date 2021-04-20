package cn.itcast.Demo;

import java.util.Scanner;

public class ifDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();
        int max;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("最大值:" + max);
    }
}
