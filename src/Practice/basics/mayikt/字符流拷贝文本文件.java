package Practice.basics.mayikt;

import java.io.*;

/**
 * @Title: 字符流拷贝文本文件
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/10 17:36
 * @description: 使用字符流拷贝文本文件
 */
public class 字符流拷贝文本文件 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            //1.创建字符输入输出流并指定拷贝的文件路径，设置相同的编码格式以防止字符乱码
            inputStreamReader = new InputStreamReader(new FileInputStream("D:\\File\\java.txt"), "utf-8");
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream("D:\\File\\day01\\java.txt"), "utf-8");
            //2.为了提高效率，创建字符数组作为数据拷贝缓冲区
            char[] chars = new char[1024];
            int len;//定义变量用来记录字符输入流读取到的字符个数
            //3.将字符输入流中的数据写入到字符输出流中，写入的数据长度为读取到的字符长度
            while ((len = inputStreamReader.read(chars)) != -1) {
                outputStreamWriter.write(chars, 0, len);
            }
            System.out.println("拷贝文件成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.关闭字符输入输出流，释放系统资源
            try {
                if (inputStreamReader != null && outputStreamWriter != null) {
                    inputStreamReader.close();
                    outputStreamWriter.close();
                    System.out.println("资源释放成功");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
