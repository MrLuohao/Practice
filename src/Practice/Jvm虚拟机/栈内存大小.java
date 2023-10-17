package Practice.Jvm虚拟机;

/**
 * @Title: 栈内存大小
 * @Author Mr.罗
 * @Package Practice.Jvm虚拟机
 * @Date 2023/10/16 15:35
 * @description: 设置栈内存大小
 */
public class 栈内存大小 {
    static long count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println(count);//默认为8118    设置为256k过后变成了1986
        main(args);
    }
}
