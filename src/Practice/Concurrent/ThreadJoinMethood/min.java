package Practice.Concurrent.ThreadJoinMethood;

/**
 * @Title: min
 * @Author Mr.罗
 * @Package Practice.Concurrent.ThreadJoinMethood
 * @Date 2023/6/14 17:52
 * @description: 主线程测试类
 */
public class min {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            myThread.join();//join方法的作用加入到当前线程，也就是myThread线程加入到mian线程中，myThread线程执行完毕main线程才执行完
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "执行结束");
    }

}
