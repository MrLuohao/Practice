package Practice.Concurrent.Callable;

import java.util.concurrent.FutureTask;

/**
 * @Title: mian
 * @Author Mr.罗
 * @Package Practice.Concurrent.Callable
 * @Date 2023/6/14 17:59
 * @description: 主线程测试类
 */
public class mian {
    public static void main(String[] args) throws Exception {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        //启动线程，执行callable的业务
        new Thread(futureTask).start();
        //同步等待callable的返回值
        String result = futureTask.get();//同步的等待callable运行结果的方式
        System.out.println(result);
        System.out.println(Thread.currentThread().getName() + "线程运行结束");
    }
}
