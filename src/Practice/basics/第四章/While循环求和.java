package Practice.basics.第四章;

/**
 * @Title: While循环求和
 * @Author Mr.罗
 * @Package Practice.basics.第四章
 * @Date 2023/8/10 21:04
 * @description: While循环求和
 */
public class While循环求和 {
    public static void main(String[] args) {
        int i = 1000;
        int Sum = 0;
        while (i > 0) {
            Sum = Sum + i;
            i--;
        }
        System.out.println("1~1000的和为:" + Sum);
    }
}
