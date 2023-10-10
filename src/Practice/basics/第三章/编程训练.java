package Practice.basics.第三章;

/**
 * @Title: 编程训练
 * @Author Mr.罗
 * @Package Practice.basics
 * @Date 2023/6/15 22:03
 * @description: 编程训练
 */
public class 编程训练 {
    public static void main(String[] args) {
        /*
        题一:统计圆柱形粮仓可以存储多少千克粮食
        圆柱的体积：V=πr²h
         */
        double PI = 3.14;
        int h = 3; //米
        int weight = 750;//每立方米能屯粮Kg数
        //1.已知直径为10，求出r
        int r = 10 / 2;
        //2.根据已知高求出V
        double V = PI * r * r * h;
        System.out.println("直径为10米，高为3米的圆柱的体积为:" + V + "立方米");
        //3.若每立方米屯粮750Kg,计算出圆柱体能屯粮多少Kg
        double TL = V * weight;//单位Kg
        System.out.println("一共能屯粮" + TL + "Kg");

        System.out.println("--------------------");
        /*
        题二:判断哪位员工不需要交税
        已知：第一位员工月薪为:4500，第二位员工薪资为:5500
        交税条件 起点工资为5000
         */

        //方式一
        int salary1 = 4500, salary2 = 5500;
        if (salary1 > 5000) System.out.println("员工1需要交税");
        else System.out.println("员工1不需要交税");
        if (salary2 > 5000) System.out.println("员工2需要交税");
        else System.out.println("员工2不需要交税");
        //方式二
        int[] arr = {4500, 5500};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5000) System.out.println("员工" + (i + 1) + "需要交税");
            else System.out.println("员工" + (i + 1) + "不需要交税");
        }
        //方式三
        String str1 = "需要交税";
        String str2 = "不需要交税";
        String reslut1 = salary1 > 5000 ? str1 : str2;
        System.out.println("薪资为" + salary1 + "的员工" + reslut1);
        String reslut2 = salary2 > 5000 ? str1 : str2;
        System.out.println("薪资为" + salary2 + "的员工" + reslut2);
    }
}
