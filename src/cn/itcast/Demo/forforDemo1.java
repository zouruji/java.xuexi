package cn.itcast.Demo;

public class forforDemo1 {
    public static void main(String[] args) {
    //需求:按照班级获取该班级所有的同学(假设一共有3个班级,每个班级5名同学),
        //原始做法
        //获取第一个班级的每一位同学
//        for(int i = 1; i<=5;i++){
//            System.out.println("正在获取第一个班级的第"+i+"名同学");
//        }
//        System.out.println();
//        //获取第二个班级的每一位同学
//        for(int i = 1 ; i<=5;i++){
//            System.out.println("正在获取第二个班级的第"+ i + "名同学");
//        }
//        System.out.println();
//
//        //获取第三个班级的每一位同学
//        for(int i = 1 ; i <= 5; i++){
//            System.out.println("正在获取第三个班级的第"+i +"名同学");
//        }
//        System.out.println();
        //1.通过for循环获取第一个班级
        for(int a = 1 ; a < 4 ; a++){ //外循环,用来获取当前班级的每一位学生
            for(int i = 1; i <=5; i++){ //内循环,用来获取当前班级的每一位学生
                //直接打印该学生的信息即可
                System.out.println("正在获取第"+a+"个班级的第"+i +"名同学");
            }
        }
    }
}
