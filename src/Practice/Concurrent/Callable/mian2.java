package Practice.Concurrent.Callable;

import java.util.concurrent.*;

/**
 * @Title: mian2
 * @Author Mr.罗
 * @Package Practice.Concurrent.Callable
 * @Date 2023/6/14 18:06
 * @description: 执行器处理线程，如果Callable线程中出现了异常在这里进行统一的处理
 */
public class mian2 {
    public static void main(String[] args) throws Exception {
        MyCallable myCallable = new MyCallable();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                5, 5, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10)) {
            @Override
            protected void afterExecute(Runnable r, Throwable t) {//当callable中的call方法运行完了再执行这个方法进行相应的处理
                //如果在call方法执行过程中有错误，则可以在此处进行处理
//                super.afterExecute(r, t);
                System.out.println("任务执行完毕" + t);
            }
        };
        Future<String> future = executor.submit(myCallable);
        String result = future.get();
        System.out.println(result);
        executor.shutdown();
    }
}
