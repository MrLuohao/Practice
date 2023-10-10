package Practice.basics.mayikt;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Title: 字节流读取文件
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/9 19:15
 * @description: 字节流以字节数组的形式读取数据
 */
public class 字节流读取文件 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\File\\java.txt");
        /*int count = 0, read;
        while ((read = fileInputStream.read()) != -1) {
            count++;
        }
        //结果为10,因为windows换行时会占有两个字节，即\r\n
        System.out.println("文件长度为:" + count + "个字节");
        //使用字节数组更加高效的读取数据
        byte[] bytes = new byte[count];*/
        /*byte[] bytes = new byte[10];
        fileInputStream.read(bytes);
        System.out.println(new String(bytes));*/
        byte[] bytes = new byte[1024];
        /*int len = fileInputStream.read(bytes);
        System.out.println(len);//读取到了10个字节的数据
        System.out.println(new String(bytes, 0, len));*/
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            System.out.println(len);
            System.out.println(new String(bytes, 0, len));
        }
        fileInputStream.close();
    }
}
