package Practice.basics.mayikt;

import java.io.*;

/**
 * @Title: 字符缓冲流
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/10 21:33
 * @description: 字符缓冲流
 */
public class 字符缓冲流 {
    public static void main(String[] args) throws IOException {
        //使用字符缓冲流向磁盘中写入数据
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\File\\day01\\MSL.txt", true));
        bufferedWriter.write("我爱学习计算机");
        bufferedWriter.newLine();//换行操作,就不需要使用\r\n去进行换行了
        System.out.println("写入数据成功");
        bufferedWriter.close();

        //使用字符缓冲流读取磁盘中的数据
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\File\\day01\\MSL.txt"));
        /*//使用read()方法读取数据
        char[] chars = new char[1024];
        int len;
        while ((len = bufferedReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }*/
        //使用readLine()方法读取数据,每次读一行，读一行指针向下移一行，最后一行时指针指向null
        String s = null;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }
        bufferedReader.close();
    }
}
