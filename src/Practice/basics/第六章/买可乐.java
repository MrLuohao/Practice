package Practice.basics.第六章;

/**
 * @Title: 买可乐
 * @Author Mr.罗
 * @Package Practice.basics.第六章
 * @Date 2023/8/19 17:33
 * @description: 买可乐案例
 */
public class 买可乐 {
    int BK;//创建成员变量表示冰块数量

    public 买可乐() {
//        BK = 0;
        this(0);//this代指成员变量
    }

    public 买可乐(int BK) {
        this.BK = BK;
    }

    public static void main(String[] args) {
        买可乐 买可乐 = new 买可乐();
        System.out.println("默认的可乐中冰块数量为:" + 买可乐.BK);
        买可乐 买可乐1 = new 买可乐(3);
        System.out.println("此时可乐中冰块数量为:" + 买可乐1.BK);
    }
}
