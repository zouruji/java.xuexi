package cn.itcast.Demo;
/*
选择结构之if语句:
第一种格式:
if(){
语句体1.

}
执行流程:
如果关系表达式成立,则执行语句1.
如果关系表达式不成立,则执行语句2.
 */
public class IfDemo1 {
    public static void main(String[] args) {
        System.out.println("开始执行");
        //定义两个int类型的变量
        int a = 10;
        int b = 20;
        //判断两个变量是否相等
        if(a == b){
            System.out.println("a和b是否相等");
        }
        System.out.println("结束执行");
    }
}
