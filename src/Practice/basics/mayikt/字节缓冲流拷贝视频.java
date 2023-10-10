package Practice.basics.mayikt;

import java.io.*;

/**
 * @Title: 字节缓冲流拷贝视频
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/10 15:24
 * @description: 使用字节缓冲流拷贝视频
 */
public class 字节缓冲流拷贝视频 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1.创建字节输入输出流并指定需拷贝的文件路径
            fileInputStream = new FileInputStream("D:\\File\\day02\\test.mp4");
            fileOutputStream = new FileOutputStream("D:\\File\\test\\test.mp4");
            //2.将字节输入输出流对象作为字节缓冲输入流构造参数进行传递，创建出字节缓冲输入输出流对象
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //3.字节缓冲流底层默认缓冲区大小为8192个字节（8192字节的byte数组），读取文件内容
            int read;
            byte[] bytes = new byte[8192];
            System.out.println("剩余内存容量:" + Runtime.getRuntime().freeMemory());
            long l1 = System.currentTimeMillis();
            while ((read = bufferedInputStream.read(bytes)) != -1) {
                //4.将字节缓冲输入流中读取到的数据写入到字节缓冲输出流当中，从而进行拷贝到指定路径
                bufferedOutputStream.write(bytes, 0, read);
            }
            System.out.println("文件拷贝成功");
            long l2 = System.currentTimeMillis();
            System.out.println("耗时" + (l2 - l1) + "毫秒");//可见，使用缓冲区字节输入输出流拷贝文件要远远比使用字节输入输出流拷贝文件快得多
            System.out.println("剩余内存容量:" + Runtime.getRuntime().freeMemory());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedInputStream != null && fileInputStream != null && bufferedOutputStream != null && fileOutputStream != null) {
                    //5.关闭输入输出流对象以及字节输入输出流对象释放系统资源
                    bufferedInputStream.close();
                    fileInputStream.close();
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
