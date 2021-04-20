package cn.itcast.Demo;

public class BreakDemo1 {
    public static void main(String[] args) {
        //需求:假设班级有15名学生,查找编号为3 的学生,找到后循环就结束了
        //for循环获取所有学生信息
        for (int a = 1; a <= 15; a++) {
            System.out.println("我是编号为:" + a + "学生");
            //判断学生编号是否为3
            if (a == 3) {
                System.out.println("找打了编号为" + a + "的学生 ,循环结束");
                //break结束语句!
                break;
            }
        }
    }
}
