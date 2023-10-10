package Practice.basics.mayikt;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Title: 字符编码乱码问题
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/10 16:32
 * @description: 解决字符编码乱码问题
 */
public class 字符编码乱码问题 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\File\\java.txt"));
        byte[] bytes = new byte[1024];
        int len = bufferedInputStream.read(bytes);
        System.out.println(new String(bytes, 0, len, "UTF8"));//为了防止字符编码格式不一致导致的乱码问题，可以设置字符的编码格式。
        /*
        乱码的原因是：编码与解码的格式不一致，所以导致了字符乱码。
        解决方法就是设置解码格式与编码格式一致即可
         */
    }
}
