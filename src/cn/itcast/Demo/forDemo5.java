package cn.itcast.Demo;

public class forDemo5 {
    public static void main(String[] args) {
        /*
        需求:打印所有的水仙花数:
        水仙花解释:指的是一个三位数,其各位数字的立方和等于它本身 , 例如:
        1*1*1 + 5*5*5 +  3*3*3 =1 +125 + 27=153
         */
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i /10% 10;
            int bai = i /10 / 10 % 10;
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------------------");
        for(int i =1000 ; i >100 ; i--){
            int ge = i % 10;
            int shi = i /10% 10;
            int bai = i / 10/10 %10;
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai ==i){
                System.out.println(i);
            }
        }
    }
}
