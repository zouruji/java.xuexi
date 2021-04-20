package com.company;

public class OverLoadDemo {
    public static void main(String[] args) {
         /*
         方法重载的概念:
         同一个类中的多个方法,出现方法名相同,但是参数列表不同的情况
         参数列表不同:
         参数的个数不同
         参数的对应数据类型不同

         方法重载与方法的返回值类型无关
          */
        //需求:定义方法,分别比较两个int/long/double的数据,判断他们是否相同.
        //4.调用比较两个int类型数据的方法
        int a = 20;
        int b = 20;
        boolean flag = compare(a, b);
        System.out.println(flag);
        System.out.println("-------------------------------");
        //5.调用比较两个long类型的数据的方法
        long num1 = 10L;
        long num2 = 20L;
        boolean flag1 = compare(num1, num2);
        System.out.println(flag1);
        System.out.println("-------------------------------------");
        //6.调用比较两个double类型的数据的方法
        double  a1 = 2.1;
        double  a2 = 1.4;
        boolean flag2 = compare(a1 ,a2);
        System.out.println(flag2);
    }

    //1.定义一个方法,比较两个int类型的数据是否相同
    public static boolean compare(int a, int b) {
        System.out.println("判断两个int类型的数据是否相同");
        return a == b;
    }

    public static boolean compare(long a, long b) {
        System.out.println("判断两个long类型的数据是否相同");
        return a == b;
    }

    public static boolean compare(double a, double b) {
        System.out.println("判断两个double类型的数据是否相同");
        return a == b;
    }
}
