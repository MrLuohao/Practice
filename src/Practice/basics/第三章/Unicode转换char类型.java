package Practice.basics.第三章;

/**
 * @Title: Unicode转换char类型
 * @Author Mr.罗
 * @Package Practice
 * @Date 2023/6/13 22:32
 * @description: Unicode转换char类型
 */
public class Unicode转换char类型 {
    public static void main(String[] args) {
        String s = "a";//双引号表示是一个字符串，尽管只有一个字符a
        char s1 = 'a';//单引号表示一个字符（单个字符），而不是一个字符串
        char s2 = 97;//(会自动类型转换int转为char，等于char s2 = (char) 97)由于小写字母a在Unicode编码对应排序位置为97，所以也可以使用97来定义字符a
        System.out.println(s1);
        System.out.println(s2);//输出结果为a

        char word = 'd', word2 = '@';
        int p = 23045, p2 = 45213;
        System.out.println("d在Unicode表中的顺序位置是:" + (int) word);
        System.out.println("@在Unicode表中的顺序位置是:" + (int) word2);
        System.out.println("Unicode表中23045对应的字符为:" + (char) p);
        System.out.println("Unicode表中45213对应的字符为:" + (char) p2);

        //转义字符
        char c1 = '\\';
        char c2 = '\u2605';
        System.out.println(c1);  //  \
        System.out.println(c2); //  ★
        System.out.println(c2 + '\''); //9772
        System.out.println((int) c2); //9733
        System.out.println((int) '\''); //39
        System.out.println("回车"+'\r'+"成功");
    }
}
