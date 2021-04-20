package cn.itcast.Demo;

public class forDemo6 {
    public static void main(String[] args) {
        // 需求:打印所有水仙花的个数
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            if(ge*ge*ge + shi*shi*shi + bai*bai*bai ==i){
                ++count;
            }
        }
        System.out.println("水仙花个数是:"+count);
    }
}
