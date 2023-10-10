package Practice.basics.第五章;

import java.util.Scanner;

/**
 * @Title: 例5点1
 * @Author Mr.罗
 * @Package Practice.basics.第五章
 * @Date 2023/8/14 17:07
 * @description: 例题5点1
 */
public class 例5点1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //使用一维数组输出1~12月份的天数
        int[] month1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//非闰年中每月的天数
        int[] month2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//闰年中每月的天数
        while (true) {
            System.out.println("请输入当前年份:");
            int i1 = sc.nextInt();
            System.out.println("请输入当前月份:");
            int i2 = sc.nextInt();
            //月份合理值判断
            if (i2 > 12 || i2 < 1) {
                System.out.println("您输入的月份信息有误，请重新输入(1~12):");
            } else {
                //判断当前年份是否为闰年
                if (i1 % 4 == 0 &&/* i1 % 400 == 0 &&*/ i1 % 100 != 0) {//是闰年
                    for (int i = 0; i < month2.length; i++) {
                        if (i2 == i + 1) {
                            System.out.println(i1 + "年" + i2 + "月有" + month2[i] + "天");
                        }
                    }
                } else {//不是闰年
                    for (int i = 0; i < month1.length; i++) {
                        if (i2 == i + 1) {
                            System.out.println(i1 + "年" + i2 + "月有" + month1[i] + "天");
                        }
                    }
                }
                break;
            }
        }
    }
}