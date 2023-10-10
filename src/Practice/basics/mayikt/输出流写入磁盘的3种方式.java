package Practice.basics.mayikt;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Title: 输出流写入磁盘的3种方式
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/9 16:05
 * @description: 使用输出流写入数据到磁盘常用的3种方式
 */
public class 输出流写入磁盘的3种方式 {
    public static void main(String[] args) throws IOException {
        /*
        直接调用FileOutputStream(路径)底层就是new File("文件名")
         */
        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\File\\day02\\java.txt"));
        fileOutputStream.write(97);//每次都是单个字节的方式写入数据，效率是很低的
        fileOutputStream.write(98);
        fileOutputStream.write(99);

        byte[] bytes = {97, 98, 99};
        fileOutputStream.write(bytes);//一次性写入整个byte类型的数组，效率更高

        fileOutputStream.write(bytes, 1, 2);//一次性写入byte类型数组中指定下标范围的所有数据

        //关闭输出流
        fileOutputStream.close();
    }
}
