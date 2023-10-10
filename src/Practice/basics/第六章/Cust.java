package Practice.basics.第六章;

/**
 * @Title: Cust
 * @Author Mr.罗
 * @Package Practice.basics.第六章
 * @Date 2023/8/19 18:05
 * @description: 统计顾客的人数
 */
public class Cust {

    static int count;//表示顾客人数    使用static关键字修饰表示共享该变量
    String name;//顾客姓名

    static {
        System.out.println("此时的count值为:" + count + "(static)");   //执行结果可知static关键字修饰的代码块只执行一次，称为静态代码块
//        System.out.println("name为"+name+"(static)");静态代码块中非静态成员是访问不到的
    }

    //代码块随着类的加类而被加载，且在构造方法之前被执行
    {
        System.out.println("此时的count值为:" + count);   //没有static关键字修饰的代码块会随着类的多次加载而被多次执行
        System.out.println("未调用构造方法前的name为:" + this.name);
    }
    /*public Cust() {
        count++;
    }*/

    public Cust(String name) {
        this.name = name;
        count++;
        System.out.println("调用构造方法过后的name为:" + this.name);
    }

    public static void main(String[] args) {
        Cust cust = new Cust("kkk");
        Cust cust2 = new Cust("aaa");
        System.out.println(Cust.count);//依赖于类存在而不依赖于对象存在，所以可以直接类名.调用
    }
}
