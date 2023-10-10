package Practice.basics.mayikt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Title: 字节流赋值数据
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/9 17:13
 * @description: 字节流赋值数据
 */
public class 字节流复制数据 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1.创建输入输出流（输入流对应源文件路径，输出流对应复制的新文件路径）
            fileInputStream = new FileInputStream("D:\\File\\day02\\java.txt");
            fileOutputStream = new FileOutputStream("D:\\File\\java.txt");
            int read;
            //2.读取输入流当中的数据也就是源文件中的数据
            while ((read = fileInputStream.read()) != -1) {
                //3.将输入流当中的数据依次写入到输出流中也就是写入复制的新文件当中
                fileOutputStream.write((char) read);
            }
            System.out.println("文件复制成功");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.关闭输入输出流，对系统资源进行释放
            if (fileInputStream != null && fileOutputStream != null) {
                try {
                    fileInputStream.close();
                    fileOutputStream.close();
                    System.out.println("系统资源释放成功");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
