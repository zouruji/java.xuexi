package cn.itcast.Demo;

public class forDemo4 {
    public static void main(String[] args) {
        //需求:计算1-100之间的偶数和
        //创建sum变量
        int sum = 0;
        //循环体
        //i就是1-100之间的数字,只要判断i.是偶数即可
        for (int i = 1; i <= 100; i++) {
            //判断当前获取到的数是偶数,是就累加
            if (i % 2 == 0) {
                sum += i;
            }
        }
        //打印输出结果!
        System.out.println("sum:" + sum);
    }
}
