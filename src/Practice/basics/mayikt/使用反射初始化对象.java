package Practice.basics.mayikt;

import java.lang.reflect.Constructor;

/**
 * @Title: 使用反射初始化对象
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/11 17:25
 * @description: 使用反射技术初始化对象
 */
public class 使用反射初始化对象 {
    public static void main(String[] args) throws Exception {
        //1.调用Class.forName()获取到该类的class
        Class<?> aClass = Class.forName("Practice.basics.mayikt.Student");
        //2.使用该Class对象调用newInstance()创建出该Class的实例对象
        System.out.println(aClass);
        Student s = (Student) aClass.newInstance();//默认使用无参构造方法
        System.out.println(s);
        System.out.println("-----------------------------");
        //也可以使用getConstructor()获取到该Class的无参构造器（只能获取到共有的无参构造函数）
        Constructor<?> constructor1 = aClass.getConstructor();
        System.out.println(constructor1.toString());
        Student s2 = (Student) constructor1.newInstance();//通过无参构造器对象来实例化对象
        System.out.println(s2);

        //使用有参构造创造对象,通过getConstructor()获取到Class的有参构造器（只能获取到共有的带参函数）
        Constructor<?> constructor2 = aClass.getConstructor(String.class, Integer.class);
        System.out.println(constructor2.toString());
        Student s3 = (Student) constructor2.newInstance("穆斯林", 23);//通过带参构造器对象来实例化对象
        System.out.println(s3);
        System.out.println("-----------------------------");

        //使用反射技术获取类的所有构造函数
        Constructor<?>[] constructors = aClass.getConstructors();//getConstructors()方法只能获取到所有共有的构造方法
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println("-----------------------------");
        Constructor<?> declaredConstructo1 = aClass.getDeclaredConstructor();//获取到该aClass的无参构造函数（私有的无参构造函数也可以获取到）
        System.out.println(declaredConstructo1.toString());//打印无参构造函数相关信息
        Student s4 = (Student) declaredConstructo1.newInstance();//通过该构造函数实例化对象
        System.out.println(s4);
        Constructor<?> declaredConstructor2 = aClass.getDeclaredConstructor(String.class, Integer.class);//获取到该aClass的带参构造函数（私有的带参构造函数也可以获取到）
        System.out.println(declaredConstructor2.toString());
        Student s5 = (Student) declaredConstructor2.newInstance("穆斯林", 24);//通过该构造函数实例化对象
        System.out.println(s5);


        System.out.println("--------------以下是Stduent类中的所有构造方法---------------");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();//获取到该Class实例的所有构造函数（共有私有都可以获取到）
        for (Constructor c : declaredConstructors) {
            System.out.println(c.toString());
        }
    }
}
