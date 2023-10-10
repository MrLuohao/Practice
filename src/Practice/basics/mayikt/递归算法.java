package Practice.basics.mayikt;

/**
 * @Title: 递归算法
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/8 17:20
 * @description: 递归算法
 */
public class 递归算法 {
    /*
        递归算法求阶乘
         */
    public static int jc(int n) {
        return n == 1 ? 1 : n * jc(n - 1);
    }

    public static void main(String[] args) {
        int number = jc(5);
        System.out.println("5的阶乘等于:" + number);
    }
}
