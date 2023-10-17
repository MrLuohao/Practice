package Practice.basics.mayikt;

/**
 * @Title: 线程的创建方式2
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/12 16:11
 * @description: 线程的创建方式2
 */
public class 线程的创建方式234 implements Runnable {
    @Override
    public void run() {
        System.out.println("使用实现Runnable接口的方式创建线程");
        System.out.println(Thread.currentThread().getName() + "正在执行...");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("主线程"+Thread.currentThread().getName() + "正在执行...");//主线程


        new Thread(new 线程的创建方式234(), "线程1").start();//实现Runnable接口的方式创建多线程
        Thread.sleep(1000);

        new Thread(new Runnable() {//使用匿名内部类的方式创建多线程
            @Override
            public void run() {
                System.out.println("使用匿名内部类的方式创建线程");
                System.out.println(Thread.currentThread().getName() + "正在执行...");
            }
        }, "线程2").start();
        Thread.sleep(1000);


        //使用lambda表达式创建多线程
        new Thread(() -> System.out.println("使用lambda表达式创建线程\n" + Thread.currentThread().getName() + "正在执行..."), "线程3").start();
    }
}
