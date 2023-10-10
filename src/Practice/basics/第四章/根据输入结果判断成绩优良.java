package Practice.basics.第四章;

import java.util.Scanner;

/**
 * @Title: 根据输入结果判断成绩优良
 * @Author Mr.罗
 * @Package Practice.basics.第四章
 * @Date 2023/8/10 20:35
 * @description: 根据用户输入结果判断成绩优良
 */
public class 根据输入结果判断成绩优良 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //指定退出的循环
        break1:
        while (true) {
            System.out.println("请输入学生分数:");
            int Grade = sc.nextInt();
            switch (Grade) {
                case 10:
                case 9:
                    System.out.println("成绩为优");
                    break break1;
                case 8:
                case 7:
                    System.out.println("成绩为中");
                    break break1;
                case 6:
                    System.out.println("成绩合格");
                    break break1;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                    System.out.println("成绩不合格");
                    break break1;
                default:
                    System.out.println("您输入的成绩有误，请重新输入:");
                    break;
            }
        }
        sc.close();
    }
}
