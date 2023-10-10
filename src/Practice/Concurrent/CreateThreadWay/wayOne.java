package Practice.Concurrent.CreateThreadWay;

/**
 * @Title: wayOne
 * @Author Mr.罗
 * @Package Practice.Concurrent
 * @Date 2023/6/14 17:20
 * @description: 线程启动方式一
 */
public class wayOne extends Thread{
    @Override
    public void run() {
        System.out.println("继承Thread类的方式创建线程");
        System.out.println(getName()+"线程运行起来了");
    }
}
