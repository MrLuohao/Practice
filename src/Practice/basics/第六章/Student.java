package Practice.basics.第六章;

/**
 * @Title: AvgGrade
 * @Author Mr.罗
 * @Package Practice.basics.第六章
 * @Date 2023/8/19 20:07
 * @description: 计算平均成绩
 */
public class Student {
    static int studentID = 0;
    String name;
    double ChineseGrade;
    double MathGrade;
    double EnglishGrade;
    double AvgGrade;

    public Student(String name, double ChineseGrade, double MathGrade, double EnglishGrade) {
        this.name = name;
        this.ChineseGrade = ChineseGrade;
        this.MathGrade = MathGrade;
        this.EnglishGrade = EnglishGrade;
        studentID++;
    }

    public void show() {
        this.AvgGrade = (this.ChineseGrade + this.MathGrade + this.EnglishGrade) / 3;
        if (studentID == 3)
            System.out.println(studentID + "    " + this.name + "   " + this.ChineseGrade + "   " + this.MathGrade + "    " + this.EnglishGrade + "   " + this.AvgGrade);
        else
            System.out.println(studentID + "    " + this.name + "   " + this.ChineseGrade + "   " + this.MathGrade + "     " + this.EnglishGrade + "   " + this.AvgGrade);
    }

    public static void main(String[] args) {
        System.out.println("学号  姓名   语文    数学     英语    平均分" + "\n————————————————————————————————————————————————————");
        Student ZS = new Student("张三", 91.5, 98.0, 89.0);
        ZS.show();
        Student LS = new Student("李四", 96.0, 98.5, 93.0);
        LS.show();
        Student WW = new Student("王五", 97.0, 100.0, 98.5);
        WW.show();
        Student QL = new Student("钱六", 77.0, 83.0, 81.0);
        QL.show();
    }
}
