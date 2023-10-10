package Practice.basics.mayikt;

import java.io.*;

/**
 * @Title: 字节缓冲流
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/10 14:55
 * @description: 字节缓冲流，默认大小为8192（长度为8192的字节数组）
 */
public class 字节缓冲流 {
    public static void main(String[] args) throws IOException {
        //1. 创建一个字节输出流对象，填写写入数据，磁盘路径
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\File\\java.txt");
        //2.创建的字节缓冲区输出流在构造方法中传递的字节输出流对象，因为字节缓冲流本质上是对字节流进行的封装，以块的形式进行的对写数据
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        //3.向指定路径的文件中写入数据
        bufferedOutputStream.write("我爱学习java\r\n".getBytes());
        //4.关闭输出流，释放系统资源(先关闭缓冲字节流再关闭字节流否则将报错)
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("写入数据成功");




        /*
        read()方法，返回读取到的字节个数即长度，没有则返回-1
        从磁盘写入数据到内存叫输入流，从内存写入数据到磁盘叫输出流（基于内存操作）
         */
        FileInputStream fileInputStream = new FileInputStream("D:\\File\\java.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int read;
        byte[] bytes = new byte[1024];
        while ((read = bufferedInputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes,0,read));
        }
        bufferedInputStream.close();
        fileInputStream.close();
    }
}
