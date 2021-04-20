package  com.company;
public class ArrayDemo2 {
    public static void main(String[] args) {
        //空指针异常报错方法!
        int [] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr = null;
        System.out.println(arr[3]);
    }
}
