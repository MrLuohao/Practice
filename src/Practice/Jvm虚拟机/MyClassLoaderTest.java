package Practice.Jvm虚拟机;

/**
 * @Title: MyClassLoaderTest
 * @Author Mr.罗
 * @Package Practice.Jvm虚拟机
 * @Date 2023/10/18 20:45
 * @description: 自定义类加载器测试
 */
public class MyClassLoaderTest {
    public static void main(String[] args) {
        MyClassLoader loader = new MyClassLoader("D:\\file\\");
        try {
            Class<?> aClass = loader.findClass("MyThread");
            System.out.println("我是自定义类构造器" + aClass.getClassLoader().getClass().getName() + "构造的");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
