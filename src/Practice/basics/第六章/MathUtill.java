package Practice.basics.第六章;

/**
 * @Title: MathUtill
 * @Author Mr.罗
 * @Package Practice.basics.第六章
 * @Date 2023/8/19 19:27
 * @description: 数学工具类
 */
public class MathUtill {
    //创建数学工具类，创建一个方法，当方法传入一个double类型的参数时，计算出该值的4次幂
    public static double pow(double number) {
        return number * number * number * number;
    }

    public static void main(String[] args) {
        System.out.println(MathUtill.pow(45.6));
        System.out.println(MathUtill.pow(0.35));
    }
}
