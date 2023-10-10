package Practice.Concurrent.CreateThreadWay;

/**
 * @Title: wayTwo
 * @Author Mr.罗
 * @Package Practice.Concurrent
 * @Date 2023/6/14 17:21
 * @description: 线程启动方式二
 */
public class wayTwo implements Runnable {
    @Override
    public void run() {
        System.out.println("实现Runnable接口的方式创建线程");
        System.out.println(Thread.currentThread().getName()+"启动起来了");
    }
}
