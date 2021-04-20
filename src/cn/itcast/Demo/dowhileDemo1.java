package cn.itcast.Demo;

public class dowhileDemo1 {
    public static void main(String[] args) {
        //定义一个变量,记录练习次数.
        int count = 1;
        // 定义一个变量,用来标记是否学会这个知识点:true 学会了 , false:没学会.
        boolean isOk = false;
        // 在do while循环中模拟这个动作.
        do {
            //输出练习次数
            System.out.println("正在进行中" + count + "次练习");
            //判断练习次数,看条件是否成立!
            if (count >= 6) {
                //到这里说明已经学会了!
                //将boolea类型变量值改变成:true
                isOk = true;
            }
            count++;
            //不管是否学会,每练习一次,次数都要加一.

        } while (!isOk);
    }
}
