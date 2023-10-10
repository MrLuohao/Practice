package Practice.basics.mayikt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Title: 输出流的异常处理
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/9 16:30
 * @description: 输入输出流的异常处理
 */
public class 输出流的异常处理 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File("D:\\File\\day02\\java.txt"),true);
            fileOutputStream.write("输入输出流的异常处理".getBytes());
        } catch (IOException e) {
            System.out.println("未找到指定路径的文件");
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    System.out.println("系统资源已成功释放...");
                } else {
                    System.out.println("字节流为null,无法关闭输出流");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
