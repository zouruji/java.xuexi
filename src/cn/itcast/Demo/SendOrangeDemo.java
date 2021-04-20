package cn.itcast.Demo;

public class SendOrangeDemo {
    public static void main(String[] args) {
        /*
        需求:1024程序猿节,小黑帮你发橙子
        已知条件:
        假设有3个班级,每个班级有35名同学,现在要将100个橙子发放给每位同学,每人只能拿一个
        如果该同学已经有了橙子,则不再发给该同学:如果橙子发完了,则发放活动结束!
        假设编号为5的倍数的同学都已经有了橙子
         */
        //1.定义变量,记录发送橙子的总数.
        int count = 0 ;
        //通过for循环,获取到每一个班级
        A:for(int i = 1 ; i < 4 ; i++){  //外循环,获取到每一个班级
                  for(int j = 1; j <36 ; j++){ //内循环,获取到每一个同学
                      //判断该学生是否有橙子
                      if(j % 5 == 0){
                          //如果有, 就不发了
                          continue ; // 结束本次循环.进行下一次循环
                      }
                      //如果没有,就给该学生发橙子
                      System.out.println("正在给第"+i +"个班级的第"+ j+"个同学发橙子");
                      //没发送一个橙子,计数器都要+1
                      count++;
                      //如果橙子发完了,结束发放活动
                      if(count >= 100){
                          break A;
                      }
                  }
        }
        //打印发送橙子的数量
        System.out.println("总共发送了"+ count + "个橙子");

    }
}
