package Practice.Concurrent.Callable;

import java.util.concurrent.Callable;

/**
 * @Title: MyCallable
 * @Author Mr.罗
 * @Package Practice.Concurrent.Callable
 * @Date 2023/6/14 18:00
 * @description: callable测试
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "call方法的返回值";
    }
}
