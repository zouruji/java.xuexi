package cn.itcast.Demo;

public class BreakDemo2 {
    public static void main(String[] args) {
      /*
      需求: 程序猿同学受邀加入a公司,现按班级查找程序猿同学,
      已知:
      现有3个班级,每班10个同学
      假设第2个班级的第5位同学名叫程序猿,找到该同学后停止查找.
       */
//        通过for循环,获取到每一个班级
        label_class:
        for (int i = 1; i < 4; i++) { //外循环.
            for (int j = 1; j < 11; j++) { //内循环.
                System.out.println("正在查找第" + i + "个班级的第" + i + "个学生");
//            判断当前同学是否是程序猿同学
                if (i == 2 && j == 5) {
//                 如果是则循环结束
                    System.out.println("很好!恭喜你完成了!");
                    break label_class;  // 结束指定语句
                }
            }
        }
    }
}
