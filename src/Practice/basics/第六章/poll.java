package Practice.basics.第六章;

import java.util.Arrays;

/**
 * @Title: poll
 * @Author Mr.罗
 * @Package Practice.basics.第六章
 * @Date 2023/8/19 18:41
 * @description: 控制水池水量
 */
public class poll {
    static int water = 0;

    public static void out(int out) {
        water -= out;
    }

    public static void in(int in) {
        water += in;
    }

    public static void main(String[] args) {
        System.out.println("当前水池中的水为:" + poll.water + "吨");
        poll.in(20);//向水池注入20吨水
        System.out.println("当前水池中的水为:" + poll.water + "吨");
        poll.out(10);//将水池中的水放出10吨
        System.out.println("当前水池中的水为:" + poll.water + "吨");

        System.out.println("———————— 将主方法中的arg[]数组参数转换为大写字母输出 ———————");
        for (int i = 0; i < args.length; i++) {
            args[i] = args[i].toUpperCase();
        }
        /*for (String s:args) {
            System.out.print(s+" ");
        }
        System.out.print("?");
        */
        for (int i = 0; i < args.length; i++) {
            if (i == args.length - 1) System.out.print(args[i] + "?");
            else System.out.print(args[i] + " ");
        }
//        System.out.println(Arrays.toString(args)+"?");
    }
}
