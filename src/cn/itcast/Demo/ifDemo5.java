package cn.itcast.Demo;

import java.util.Scanner;

public class ifDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score =sc.nextInt();
        if(score >= 10 && score <= 30){
            System.out.println("王者");
        }else if(score >= 30 && score <50){
            System.out.println("星耀");
        }else if(score >= 50 && score <70){
            System.out.println("钻石");
        }else if(score >= 70 && score <90){
            System.out.println("铂金");
        }else if(score >= 90 && score < 100){
            System.out.println("黄金");
        }else{
            System.out.println("如果语句都不成立,则执行该程序!");
        }
    }
}
