package Practice.basics.第七章;

/**
 * @Title: test
 * @Author Mr.罗
 * @Package Practice.basics.第七章
 * @Date 2023/9/7 15:25
 * @description: 用于测试银行卡类
 */
public class test {
    public static void main(String[] args) {
        信用卡 XYK = new 信用卡();
        XYK.show();//此时调用的是父类中默认的值
        XYK.UpdateYe(3000);//将信用卡中的余额改为3000
        XYK.UpdateType("信用卡");//将该银行卡的类型设置为信用卡
        XYK.show();//此时该卡的属性便发生了变化，储蓄卡也是如此
    }
}
