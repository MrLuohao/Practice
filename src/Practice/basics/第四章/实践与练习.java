package Practice.basics.第四章;

import java.util.Scanner;

/**
 * @Title: 实践与练习
 * @Author Mr.罗
 * @Package Practice.basics.第四章
 * @Date 2023/8/11 14:31
 * @description: 第四章实践与练习
 */
public class 实践与练习 {
    public static void main(String[] args) {
        System.out.println("——————————— 综合训练一 ——————————");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入变量X的值:");
        int X = sc.nextInt();
        if (X % 2 == 0) System.out.println("X是偶数");
        else System.out.println("X是奇数");
        System.out.println("\n——————————— 综合训练二 ——————————");
        int lineCount = 17;// 输出的菱形有多少行，请赋值成奇数
        int maxLineNum = (lineCount + 1) / 2;// 菱形最多一行
        for (int i = 1; i <= maxLineNum; i++) {// 循环菱形数量越来越多的几行
            for (int space = 1; space <= maxLineNum - i; space++) {// 输出空格，数量=最后一行-当前行数
                System.out.print("  ");
            }
            for (int star = 1; star <= (i * 2) - 1; star++) {// 输出星号，数量=行数*2-1
                System.out.print("* ");
            }
            System.out.println();// 换行
        }

        int declineCount = lineCount - maxLineNum;// 计算剩下的几行，这几行星号的数量是递减的
        for (int i = 1; i <= declineCount; i++) {// 循环菱形数量越来越少的行数
            for (int space = 1; space <= i; space++) {// 输出空格，数量等于当前的行数
                System.out.print("  ");
            }
            for (int star = 1; star <= (declineCount - i + 1) * 2 - 1; star++) {// 输出星号，数量等于（总数-当前行数）*2-1
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n——————————— 综合训练三 ——————————");
        System.out.println("请输入你相求哪个数的阶乘倒数和:");
        int number = sc.nextInt();
//        int sum = sum(number);
        double sum = 0, a = 1;
        int i = 1;
        while (i <= number) {
            sum = sum + a;
            i = i + 1;
            a = a * (1.0 / i);
        }
        System.out.println("1~该数的阶乘倒数和为:" + sum);
    }

    /*static int sum(int n) {
        if (n == 1) return 1;
        else return (1 / (n * sum(n - 1))) + (1 / ((n - 1) * sum(n - 2)));
    }*/
}