package Practice.basics.第三章;

/**
 * @Title: 实践与练习
 * @Author Mr.罗
 * @Package Practice.basics.第一章
 * @Date 2023/8/10 17:15
 * @description: 第一章的实践与练习
 */
public class 实践与练习 {
    public static void main(String[] args) {
        /*
        第一题
         */
        char Ma = '马';
        char Xiang = '象';
        char Zu = '卒';
        System.out.println(Ma + "走日," + Xiang + "走田," + "小" + Zu + "一去不复还");
        System.out.println("————————————————————————————");
        /*
        第二题
         */
        String YH = "中国工商银行";
        String data = "2021-03-10";
        String name = "张三";
        String number = "1234567890987654321";
        System.out.println("\t\t" + YH);
        System.out.println("\n___________________");
        System.out.println("日期:" + "\t" + data);
        System.out.println("户名:" + "\t" + name);
        System.out.println("账号:" + "\t" + number);
        System.out.println("币种:" + "\tRMB");
        System.out.println("存款金额:" + "\t10000.0");
        System.out.println("存款序号:" + "\t010");
        System.out.println("柜员号:" + "\t12345");
        /*
        第三题
         */
        System.out.println("————————————————————————————");
        String name1 = "李四";
        char sex = '男';
        int age = 25;
        float height = 1.76F;
        double weight = 65.5;
        System.out.println("\t\t个人基本信息");
        System.out.println("___________________");
        System.out.println("姓名:" + "\t" + name1);
        System.out.println("性别:" + "\t" + sex);
        System.out.println("年龄:" + "\t" + age);
        System.out.println("身高:" + "\t" + height + "米");
        System.out.println("体重:" + "\t" + weight + "千克");
        System.out.println("是否已婚:" + "\t" + ((age <= 18) ? true : false));
        /*
        第四题
         */
        System.out.println("————————————————————————————");
        int GZ = 4500;
        int JJ = 1000;
        int WXYJ = 500;
        System.out.println("小李每月最终收入为:" + (GZ + JJ - WXYJ));
        /*
        第五题
         */
        System.out.println("————————————————————————————");
        int number1 = 123;
        int FirstNumber = number1 / 100;
        int SecondNumber = number1 % 100 / 10;
        int ThreeNumber = number1 % 120;
        System.out.println(ThreeNumber + "" + SecondNumber + "" + FirstNumber);
        /*
        第六题
         */
        System.out.println("————————————————————————————");
        int Grade = 80;
        System.out.println(Grade > 60 ? "成绩合格" : "成绩不合格");
        /*
        第七题
         */
        System.out.println("————————————————————————————");
        int Ye = 10;//余额
        double ThDj = 0.2;//通话单价（每分钟/元）
        int Time = 30;//已通话分钟数
        int Ll = 10;//已使用流量
        double LlDj = 0.3;//流量单价/MB/元
        double YSY = ThDj * Time + Ll * LlDj;//已使用话费
        double SYYE = Ye - YSY;//剩余话费余额
        System.out.println("还可以通话分钟数为:" + (int) (SYYE / ThDj) + "分钟");
        /*
        第八题
         */
        System.out.println("————————————————————————————");
        /*int i = 400 * 160 * 30;//货车车厢体积
        double v = (23 / 2) * (23 / 2) * (23 / 2) * (4 / 3) * 3.14;//一个西瓜的体积
        int sum2 = (int) (i / v);
        System.out.println("货车满载可以装" + sum2 + "个西瓜");
        System.out.println("实际可以装"+i/(23*23*23)+"个西瓜");
        System.out.println("---------");*/
        double l = 400, w = 160, h = 30;// 货箱的长宽高
        double r = 23;// 西瓜的直径
        int lCount = (int) (l / r);// 长可以放下的西瓜数量
        int wCount = (int) (w / r);// 宽可以放下的西瓜数量
        int hCount = (int) (h / r);// 高可以放下的西瓜数量
        System.out.println("货车满载时能装" + (lCount * wCount * hCount) + "个西瓜");
        System.out.println((lCount * wCount * hCount) > 100 ? "货车实际能装100个西瓜" : "货车实际能装" + (lCount * wCount * hCount) + "个西瓜");
    }
}
