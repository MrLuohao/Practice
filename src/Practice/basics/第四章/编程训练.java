package Practice.basics.第四章;

import java.util.Scanner;

/**
 * @Title: 编程训练
 * @Author Mr.罗
 * @Package Practice.basics.第四章
 * @Date 2023/8/10 20:46
 * @description: 编程训练
 */
public class 编程训练 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("————————  训练一  ————————");
        System.out.println("\n请输入学生分数:");
        int Grade = sc.nextInt();
        if (Grade >= 90) {
            System.out.println("成绩优秀");
        } else if (Grade >= 80 && Grade < 90) {
            System.out.println("成绩良好");
        } else if (Grade >= 60 && Grade < 80) {
            System.out.println("成绩合格");
        } else System.out.println("成绩不合格");
        System.out.println("————————  训练二  ————————");
        System.out.println("\n请输入月份信息:");
        String Month = sc.next();
        switch (Month) {
            case "一月":
            case "二月":
            case "三月":
                System.out.println("春季");
                break;
            case "四月":
            case "五月":
            case "六月":
                System.out.println("夏季");
                break;
            case "七月":
            case "八月":
            case "九月":
                System.out.println("秋季");
                break;
            case "十月":
            case "十一月":
            case "十二月":
                System.out.println("冬季");
                break;
            default:
                System.out.println("你输入的月份有误！");
                break;
        }*/
        System.out.println("————————  训练三  ————————");
        int sum = 1;
        for (int i = 1; i < 10; i++) {
            sum = sum * 2;
        }
        System.out.println("第十代细菌数量为:" + sum);
        /*int cellNum =1,time = 1 ;
        while(time < 10){
            cellNum *= 2;
            time++;
        }
        System.out.println("第" + time + "代菌落中的细菌数量:" + cellNum + "个。");*/
        System.out.println("————————  训练四  ————————");
        System.out.println("请输入您想知道的斐波拉契数列中的第几个数:");
        int FBLQ = sc.nextInt();
        int number = FBLQSL(FBLQ);
        System.out.println("斐波拉契数列中第" + FBLQ + "个数为" + number);
        /*int num1 = 1, num2 = 1;// 前两个数字
        System.out.print("请输入要查看第n个数中的n值：");
        int n = sc.nextInt();// 记录用户输入的数字
        for (int i = 2; i < n; i++) {// 从2开始
            num1 = num1 + num2;// 后一个数字是前两个数字之和
            // 交换num1和num2的值
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("第" + n + "个数为" + num2);// 输出指定位数上的数据*/
        sc.close();
        System.out.println("————————  训练五  ————————");
        int high = 10;
        int day = 1;
        while (true) {
            high = high - 2;
            if (high == 0) break;
            high = high + 1;
            day++;
        }
        System.out.println("蜗牛爬到井口需要" + day + "天");
        /*int distance = 0;
        int day1 = 1;
        while (true) {
            distance += 2;
            if (distance >= 10) {
                break;
            }
            distance -= 1;
            day1++;
        }
        System.out.println("蜗牛第" + day1 + "天爬到了井口。");*/
        System.out.println("————————  训练六  ————————");

        for (int i = 1; i < 5; i++) {
            for (int ii = 1; ii < 11; ii++) {
                if (/*(i == 1 && ii == 1) || (i == 2 && ii == 1) || (i == 3 && ii == 1) || (i == 4 && ii == 1) ||
                        (i == 1 && ii == 10) || (i == 2 && ii == 10) || (i == 3 && ii == 10) || (i == 4 && ii == 10)*/
                        ii == 1 || ii == 10
                ) continue;
                System.out.println("正在出售第" + i + "行第" + ii + "个座位");
            }
        }
    }

    static int FBLQSL(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        else return FBLQSL(n - 1) + FBLQSL(n - 2);
    }
}
