package Practice.basics.第七章;

/**
 * @Title: student
 * @Author Mr.罗
 * @Package Practice.basics.第七章
 * @Date 2023/9/7 15:41
 * @description: 学生类重写toString方法
 */
public class student {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "学生姓名为:" + name + "\n学生年龄为:" + age;
    }
}
