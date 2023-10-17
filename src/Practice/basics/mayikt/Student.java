package Practice.basics.mayikt;

/**
 * @Title: student
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/11 17:33
 * @description: 创建学生测试类
 */
public class Student {
    String name;
    Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private Student(String name) {
        this.name = name;
    }

    private Student(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
