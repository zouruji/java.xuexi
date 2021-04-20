package cn.itcast.Demo;

public class forDemo3 {
    public static void main(String[] args) {
//     需求:计算1-5之间的所有数据之和
        //创建一个变量
        int sum = 0;
        for (int a = 1; a <= 5; a++) {
            sum += a;
        }
        System.out.println("sum:" + sum);

    }
}
