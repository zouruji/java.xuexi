package cn.itcast.Demo;

public class IfDemo3 {
    public static void main(String[] args) {
        int miss = 89;
        if (miss > 0 && miss < 13) {
            System.out.println("小小怪下午好!");
        } else if (miss > 8 && miss < 15) {
            System.out.println("小小怪上午好!");
        }else if(miss > 15 && miss < 24){
            System.out.println("小小怪晚上好!");
        }else{
            //如果前面语句都不符合!将执行改语句!
            System.out.println("程序无法执行");
        }
        }
    }
