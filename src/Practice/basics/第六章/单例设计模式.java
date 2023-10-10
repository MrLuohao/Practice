package Practice.basics.第六章;

/**
 * @Title: 单例设计模式
 * @Author Mr.罗
 * @Package Practice.basics.第六章
 * @Date 2023/8/19 19:51
 * @description: 单例设计模式
 */
public class 单例设计模式 {
    private static 单例设计模式 Singleton;

    private 单例设计模式() {
    }

    public static 单例设计模式 getInstance() {
        if (Singleton == null) {
            synchronized (单例设计模式.class) {
                if (Singleton == null) {
                    Singleton = new 单例设计模式();
                }
            }
            return Singleton;
        }
        return Singleton;
    }
}
