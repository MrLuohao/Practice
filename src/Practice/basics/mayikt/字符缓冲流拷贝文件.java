package Practice.basics.mayikt;

import java.io.*;

/**
 * @Title: 字符缓冲流拷贝文件
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/11 15:56
 * @description: 字符缓冲流拷贝文件
 */
public class 字符缓冲流拷贝文件 {
    public static void main(String[] args) throws IOException {
        //1.创建字符输入输出流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\File\\day01\\MSL.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\File\\day02\\MSL.txt"));
        String s;
        //2.一行一行读取字节输入流中的数据
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
            //3.将读取到的数据写入字符输出流中即复制到指定路径的文件中
            bufferedWriter.write(s);
            bufferedWriter.newLine();//换行操作
        }
        System.out.println("文件拷贝成功");

        //4.关闭字符输入输出流，释放系统资源
        bufferedReader.close();
        bufferedWriter.close();

        //使用命令打开复制的新文件发现文件已成功复制
        Runtime.getRuntime().exec("notepad D:\\File\\day02\\MSL.txt");
    }
}
