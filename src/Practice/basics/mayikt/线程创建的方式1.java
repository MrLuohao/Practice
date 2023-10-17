package Practice.basics.mayikt;

/**
 * @Title: 线程创建的方式
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/12 15:56
 * @description: 线程创建的方式1
 */
public class 线程创建的方式1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("线程创建方式一,继承Thread类。");
        System.out.println(Thread.currentThread().getName());//main线程是主线程
        //启动线程调用start()方法而不是run()方法
        new 线程创建的方式1().start();//start()方法线程进入就绪状态，cpu调度到该线程时会自动调用底层的run()方法，这时线程便从就绪状态变为运行状态
        new 线程创建的方式1().start();
        new 线程创建的方式1().start();
    }
}
