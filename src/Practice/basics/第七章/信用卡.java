package Practice.basics.第七章;

/**
 * @Title: 信用卡
 * @Author Mr.罗
 * @Package Practice.basics.第七章
 * @Date 2023/9/7 15:20
 * @description: 信用卡继承银行卡
 */
public class 信用卡 extends bank {
    void UpdateYe(int Money) {
        //定义方法修改余额
        YE = Money;
    }

    void UpdateType(String type) {
        //定义方法修改卡的类型
        super.type = type;
    }

    void show() {
        //定义方法实现对该卡信息的展示
        System.out.println("该银行卡为:" + type);//默认使用父类中的type属性
        System.out.println("余额为:" + YE);//默认使用父类中余额
    }
}
