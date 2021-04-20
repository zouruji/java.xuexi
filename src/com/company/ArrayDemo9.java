package com.company;

public class ArrayDemo9 {
    public static void main(String[] args) {
        int x = 4;
        int y = 6;
        int z = sum(x, y);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        a++;
        b++;
        return c;
    }
}
