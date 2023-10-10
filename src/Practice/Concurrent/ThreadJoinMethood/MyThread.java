package Practice.Concurrent.ThreadJoinMethood;

/**
 * @Title: MyThread
 * @Author Mr.罗
 * @Package Practice.Concurrent.ThreadJoinMethood
 * @Date 2023/6/14 17:51
 * @description: 创建一个线程
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "正在打印" + i);
        }
    }
}
