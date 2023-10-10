package Practice.basics.第七章;

/**
 * @Title: Object类常用方法的测试
 * @Author Mr.罗
 * @Package Practice.basics.第七章
 * @Date 2023/9/7 15:32
 * @description: Object类常用方法的测试
 */
public class Object类常用方法的测试 {
    public static void main(String[] args) {
        bank bank = new bank();
        //使用getClass()方法和gatName()方法可以获取到当前对象的类名称
        String name = bank.getClass().getName();
        System.out.println("该实例类名称为:" + name);//Practice.basics.第七章.bank
        System.out.println(bank.getClass().getName().toString());
        //重写student类中的toString方法并测试
        student student = new student();
        student.setName("小明");
        student.setAge(20);
        String s = student.toString();
        System.out.println(s);
        //equals()方法和==的区别
        String str = "123";
        String str2 = "123";
        System.out.println(str == str2);//
        System.out.println(str.equals(str2));
        //两个没有继承关系的对象不能向上或向下转型，且父类对象可以强制转换为子类对象，但有一个前提：这个父类对象要先引用这个子类对象
        bank b = new 信用卡();
        信用卡 xxx = (信用卡) b;
    }
}
