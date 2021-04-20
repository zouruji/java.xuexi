package com.company;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        /*
        案列:猜数字的小游戏
        系统产生一个1-100之间的随机数,请猜出这个数是多少?
         */
        //创建对象
        Random r = new Random();
        //获取指定随机数
        int num = r.nextInt(100) + 1;
        //创建对象,并录入用户要猜的数据,并接收
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要猜的数字(1-100):");
            //比较猜的数字大小比较
            int guessNum = sc.nextInt();
            if (guessNum > num) {
                System.out.println("您猜大了!");
            } else if (guessNum < num) {
                System.out.println("您猜小了!");
            } else {
                System.out.println("恭喜您,猜对了!请找小黑领取奖品!");
                //结束循环
                break;
            }
        }
    }
}
