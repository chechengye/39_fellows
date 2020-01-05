import java.util.Scanner;

public class HelloWorld {
    //主函数的快捷键 psvm
    public static void main(String[] args) {
        //sout
        System.out.println("hello,world");
        testMethod();
        System.out.println("请输入一个数:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
        int a = 20;
        System.out.println(a);
    }

    public static void testMethod(){
        System.out.println(i);

    }
    private static int i = 10;
}
