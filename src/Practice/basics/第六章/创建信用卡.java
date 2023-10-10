package Practice.basics.第六章;

/**
 * @Title: 创建信用卡
 * @Author Mr.罗
 * @Package Practice.basics.第六章
 * @Date 2023/8/19 17:43
 * @description: 创建信用卡默认密码
 */
public class 创建信用卡 {
    int ID;//创建成员变量表示信用卡卡号
    int password;//创建成员变量表示信用卡密码

    public 创建信用卡() {
//        this.password = 123456;
        this(123456);   //在无参构造方法中使用this()给某个成员变量设置默认值时必须先创建包含该成员变量参数的构造方法
    }

    public 创建信用卡(int password) {
        this.password = password;
    }

    public static void main(String[] args) {
        int id = new 创建信用卡().ID;//默认的ID
        System.out.println(id);
        int password = new 创建信用卡().password;//默认的密码为我们创建信用卡对象时构造方法里设置的默认值
        System.out.println("默认的信用卡密码为:"+password);
        int password1 = new 创建信用卡(234456).password;
        System.out.println("用户手动设置的信用卡密码为:" + password1);
    }
}
