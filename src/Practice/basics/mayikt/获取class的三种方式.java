package Practice.basics.mayikt;

/**
 * @Title: 获取class的三种方式
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/11 16:50
 * @description: 获取class的三种方式
 */
public class 获取class的三种方式 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.直接使用类名.class方法
        Class<获取class的三种方式> aClass = 获取class的三种方式.class;
        //2.使用该类对象调用getClass()方法
        获取class的三种方式 a = new 获取class的三种方式();
        Class<? extends 获取class的三种方式> bClass = a.getClass();
        //3.使用Class.forName()方法   :使用得最多
        Class<?> cClass = Class.forName("Practice.basics.mayikt.获取class的三种方式");
        System.out.println(aClass + "\n" + bClass + "\n" + cClass);
    }
}
