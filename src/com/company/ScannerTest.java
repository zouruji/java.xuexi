package com.company;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        定义一个类
        PrintStream out = System.out;
        InputStream in = System.in;
//        对应的对象,输出想要的类型.
        Scanner scanner = new Scanner(in);
        out.print("Your name:");
        String name = scanner.next();
        out.print("Your age:");
        int age = scanner.nextInt();
        out.format("Hi%s,your age is %d\n ", name, age);
    }
}
