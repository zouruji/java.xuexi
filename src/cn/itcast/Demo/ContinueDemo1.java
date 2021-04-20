package cn.itcast.Demo;

public class ContinueDemo1 {
    public static void main(String[] args) {
        // 需求 : 模拟逢7避过的游戏
        //for循环取到1-100的数字
        for (int i = 1; i <= 100; i++) {
            //包含7或者7的倍数,这些都是不合法的
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
//                System.out.println(".....");
                continue;
            }
            //如何数据通过!则直接打印
            System.out.println(i);
        }
    }
}
