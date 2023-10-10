package Practice.basics.第六章;

/**
 * @Title: movie
 * @Author Mr.罗
 * @Package Practice.basics.第六章
 * @Date 2023/8/19 19:36
 * @description: 购买电影票
 */
public class movie {
    String name;
    int age;
    int price;

    public movie() {
    }

    public movie(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        if (age > 18) this.price = 40;
        else this.price = 20;
        if (age != 8) System.out.println(this.name + "  " + this.age + "  " + this.price);
        else System.out.println(this.name + "  " + this.age + "   " + this.price);
    }

    public static void main(String[] args) {
        movie people1 = new movie("李明", 20);
        movie people2 = new movie("钱丽", 16);
        movie people3 = new movie("周刚", 8);
        movie people4 = new movie("吴红", 32);
        System.out.println("姓名  年龄  票价(元)" + "\n——————————————————————————");
        people1.show();
        people2.show();
        people3.show();
        people4.show();
    }
}
