package Practice.Concurrent.CreateThreadWay;
/**
 * @Title: 两种方式启动线程
 * @Author Mr.罗
 * @Package Practice.Concurrent.Thread
 * @Date 2023/6/14 17:18
 * @description: 两种方式启动线程
 */
public class 两种方式启动线程 {
    public static void main(String[] args) {
        /*
        线程创建的两种方式：1.创建一个类继承Thread类并重写里面的run方法，然后创建该类的对象执行start方法就会去执行run方法，从而启动线程
                        2.创建一个类实现Runnable接口，并重写里面的run方法，然后使用new Thread()构造方法并创建该类的对象作为参数传入构造方法，最后调用start方法启动该线程
         */
        new wayOne().start();
        System.out.println(Thread.currentThread().getName()); //main线程
        new Thread(new wayTwo()).start();
    }
}
