package Practice.basics.第四章;

import java.util.Scanner;

/**
 * @Title: DoWhile循环判断登录
 * @Author Mr.罗
 * @Package Practice.basics.第四章
 * @Date 2023/8/10 21:10
 * @description: do....While循环判断登录
 */
public class DoWhile循环判断登录 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Password;
        do {
            System.out.println("请输入密码:");
            Password = sc.nextInt();
        } while (Password != 931567);
        System.out.println("登录成功");
        sc.close();
    }
}
