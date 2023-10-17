package Practice.basics.mayikt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Title: 线程池创建线程
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/12 17:07
 * @description: 使用线程池创建线程
 */
public class 线程池创建线程 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> System.out.println(Thread.currentThread().getName() + "正在执行..."));
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"正在执行...");
            }
        });
    }
}
