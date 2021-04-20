package cn.itcast.Demo;

import java.util.Scanner;

// 1.导包
public class ScannerDemo {
    public static void main(String[] args) {
       //创建键盘录入对象
        Scanner  sc = new Scanner(System.in);
//         3.接收数据
        System.out.println("请输入一个整数:");
        int i  = sc.nextInt();
//        将用户录入的数据打印到控制台上
        System.out.println("i:" + i);
    }
}
