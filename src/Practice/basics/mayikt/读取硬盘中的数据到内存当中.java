package Practice.basics.mayikt;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Title: 读取硬盘中的数据到内存当中
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/9 16:45
 * @description: 读取磁盘中的数据到内存当中
 */
public class 读取硬盘中的数据到内存当中 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            //1.创建输入流并指定读取的文件路径
            fileInputStream = new FileInputStream("D:\\File\\day02\\java.txt");
            //2.read()方法读取文件中的数据，返回int类型，每次读取一个字符，读取完毕指针向后移动一位
            int read;
            //3.使用循环判断指针是否移动到文件末尾，若为末尾即指针下一个位置没有数据，则返回-1
            while ((read = fileInputStream.read()) != -1) {//先赋值后判断
                //4.直接输出数据
                System.out.print((char) read);
                /*//指针后移
                read = fileInputStream.read();*/
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //判断输入流是否为空
            if (fileInputStream != null) {
                try {
                    //不为空则关闭输入流
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
