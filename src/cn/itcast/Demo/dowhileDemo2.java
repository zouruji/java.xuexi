package cn.itcast.Demo;

public class dowhileDemo2 {
    public static void main(String[] args) {
        int count = 1;
        boolean isOK = false;
        do {
            System.out.println("正在进行的次数" + count + "第几次");
            if (count >= 4) {
                isOK = true;
            }
            count++;
        } while (!isOK);
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        for (int i = 1; i <=10 ; i++) {
            System.out.println("次数:" + i);
        }
    }
}
