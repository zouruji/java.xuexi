package com.company;

public class ConversionDemo {
    public static void main(String[] args) {
        //定义两个int类型的变量
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        //我可以吧a+b的结果进行输出,说明这样计算是没有问题
        //那么,我也可以吧这个结果接收一下....
        int c = a + b;
        System.out.println(c);
        System.out.println("----------------------------------");
        //定义一个int类型的数据和 一个byte类型的数据
        int aa = 10;
        byte bb = 20;
        System.out.println(aa + bb);
        int cc = aa + bb;;
        System.out.println("-----------------------------------");
        System.out.println(cc);
        //byte dd = aa+bb;  这种类型无法表决
        //System.out.println(dd); 报错!  这里运用到转换
        //目标类型  变量名 = (目标类型)要转换的值;
        byte dd = (byte) (aa + bb);
        System.out.println(dd);
        System.out.println("-------------------------------");
        // 强制转换:丢失小数精度
        double di = 3.14;
        int a1 = (int) di;
        System.out.println(a1);
    }
}
