package Practice.basics.第三章;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Title: 计算体重
 * @Author Mr.罗
 * @Package Practice
 * @Date 2023/6/13 21:53
 * @description: 根据体重和身高计算BMI指数
 */
public class 计算BMI {
    //BMI=体重/(身高*身高)
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高:");
        double height = sc.nextDouble();//单位米
//        double height = System.in.read();/*报错，读取键盘输入的一个字符*/
        System.out.println("请输入你的体重:");//单位KG
        int weight = sc.nextInt();
        /*
        默认类型为double，如果需要将其转换为float需在前面加上(float)进行强制类型转换
         */
        double BMI = weight / (height * height);
        System.out.println("您的BMI指数为:" + BMI);
        if (BMI < 18.5) {
            System.out.println("体重过轻");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("正常范围");
        } else if (BMI >= 24.9 && BMI < 29.9) {
            System.out.println("体重过重");
        } else {
            System.out.println("肥胖，需减肥");
        }
    }
}
