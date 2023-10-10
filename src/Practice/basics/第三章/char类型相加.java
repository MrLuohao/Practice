package Practice.basics.第三章;

/**
 * @Title: char类型相加
 * @Author Mr.罗
 * @Package Practice.basics
 * @Date 2023/8/10 16:53
 * @description: char类型相加的练习
 */
public class char类型相加 {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        char d = 'd';
        char e = 'e';
        char f = 'f';
        char g = 'g';
        char sum = (char) (a + b + c + d + e + f + g);
        System.out.println(sum);
        System.out.println("’a’~’g’相加后的结果：" + (a + b + c + d + e + f + g));
        /*
        货车装箱子
         */
        int sum1 = (int) ((2 * 4) / (1.5 * 1.5));
        System.out.println("货车一共可以装" + sum1 + "个箱子");
        int vanWidth = 2;
        int vanLength = 4;
        double boxWidth = 1.5;
        double boxLength = 1.5;
        int boxNumber = (int)(vanWidth/boxWidth) * (int)(vanLength/boxLength);
        System.out.println("载货区一层可以放" + boxNumber + "箱子！");
    }
}
