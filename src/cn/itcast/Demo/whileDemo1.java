package cn.itcast.Demo;

public class whileDemo1 {
    public static void main(String[] args) {
        //需求:用while语句输出5次hello world.
        for(int i = 1 ; i <= 5; i++){
            System.out.println("hello world");
        }
        System.out.println("------------------");
        int i = 1;
        while (i <= 5){
            System.out.println("hello world");
            i++;
        }
    }
}
