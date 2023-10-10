package Practice.basics.mayikt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Title: 字节流写入数据换行和追加写
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/9 16:20
 * @description: 字节流写入数据换行和追加写
 */
public class 字节流写入数据换行和追加写 {
    public static void main(String[] args) throws IOException {
        //第二个参数为true则表示写入数据的方式为追加
        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\File\\day02\\python.java"), true);
        for (int i = 0; i < 10; i++) {
            //字节流写入数据换行操作为\n(不同的操作系统有些许区别)
            fileOutputStream.write("Java.java\n".getBytes());
        }
        fileOutputStream.close();
    }
}
