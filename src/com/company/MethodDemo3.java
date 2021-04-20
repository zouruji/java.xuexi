package com.company;
/*
定义方法的注意事项:
1.方法必须定义在类中
2.方法与方法之间是平级关系,不能嵌套定义.
3.方法没有返回值时,返回值类型必须写成:void.
4.方法返回值类型为void时,可以省略方法最后的return语句.
5.return语句后值的类型必须和方法的返回值的类型一致.
6.return之后不能再放置语句.
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        //调用方法
        boolean c = compare(10, 20);
        System.out.println(c);
    }

    public static boolean compare(int a, int b) {
            return a == b;
    }//compare方法的结束标记

}
