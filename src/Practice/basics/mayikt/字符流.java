package Practice.basics.mayikt;

import java.io.*;
import java.util.Arrays;

/**
 * @Title: 字符流
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/10 16:40
 * @description: 字符流其实就是对字节流的包装
 */
public class 字符流 {
    public static void main(String[] args) throws IOException {
        /*
        如果我们读取的文件内容是汉字，应该优先考虑使用字符流，避免内容出现乱码问题
         */
        //1.创建字符输出流向指定路径的磁盘中写入数据,并指定写入数据的编码格式
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("D:\\File\\java.txt", true), "utf-8");
        outputStreamWriter.write("字符流其实就是对字节流的包装\r\n");
        //2.关闭字符输出流，释放系统资源
        outputStreamWriter.close();
        System.out.println("写入数据成功");

        //3.创建字符输入流读取指定路径的磁盘中的数据,并指定读取数据的编码格式与写入数据的编码格式保持一致避免出现乱码问题
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("D:\\File\\java.txt"), "utf-8");
        //4.为了提高读取效率，减小系统资源的消耗，创建字符数组作为缓冲区（因为使用的是字符流所以参数传递不再是字节数组而是字符数组）
        char[] chars = new char[1024];
        int read;
        //5.从字符输入流中读取数据
        while ((read = inputStreamReader.read(chars)) != -1) {
            //6.将读取到的字符数组中的数据转换为字符串类型并打印在控制台
            System.out.println(new String(chars, 0, read));
        }
        //7.关闭字符输入流，释放系统资源
        inputStreamReader.close();
    }
}
