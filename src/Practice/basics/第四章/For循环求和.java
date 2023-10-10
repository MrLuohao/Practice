package Practice.basics.第四章;

/**
 * @Title: For循环求和
 * @Author Mr.罗
 * @Package Practice.basics.第四章
 * @Date 2023/8/10 21:26
 * @description: For循环求1~100偶数和
 */
public class For循环求和 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum = sum + i;
        }
        System.out.println("2~100的偶数和为:" + sum);
        //foreach循环遍历数组元素
        int[] arr = {22, 333, 121, 466};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
