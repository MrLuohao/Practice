package Practice.basics.mayikt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Title: 字节流复制图片
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/9 20:04
 * @description: 使用字节流复制图片
 */
public class 字节流拷贝视频文件 {
    /*
    read()方法返回的是读取到的数据的字节长度，而真正的数据保存在创建的字节数组中
    所以可以用返回的长度来判断是否读取到了数据，在拷贝文件时也可以用作限制拷贝字节数组中的有效数据的长度
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1.创建输入输出流
            fileInputStream = new FileInputStream("D:\\File\\day02\\test.mp4");
            fileOutputStream = new FileOutputStream("D:\\File\\day01\\test.mp4");
            //2.设置字节数组大小（一次性传输多少字节的数据进行复制）
            byte[] bytes = new byte[8192];
            int len;
            //3.判断是否读取到数据，如果能读取到数据则返回读取到的数据长度（单位字节）否则返回-1则表示已读取数据到末尾，则跳出循环
            while ((len = fileInputStream.read(bytes)) != -1) {
                //4.将读取到的数据通过输出流拷贝到磁盘指定路径下
                fileOutputStream.write(bytes, 0, len);//需要设置读取的数据长度，因为最后一次读取数据可能已经没有8192字节的长度，未使用的空间就会自动填充为0，便会破坏文件本身，所以需要限制长度，不能将字节数组中的空数据也复制到文件中
            }
            System.out.println("文件拷贝成功");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null && fileOutputStream != null) {
                try {
                    //5.释放系统资源
                    fileInputStream.close();
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
