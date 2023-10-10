package Practice.basics.mayikt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Title: IO流
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/9 15:45
 * @description: 字节流写入数据：将程序中的数据写入磁盘
 */
public class IO流 {
    public static void main(String[] args) throws IOException {
        //1.创建文件输出流，需要指定文件写入路径并抛出异常
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\File\\day02\\b.txt");
        //2.提示用户输入信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入信息:");
//        String s = sc.nextLine();
        int i = sc.nextInt();
        //3.将用户输入的信息通过输出流写入到磁盘
        fileOutputStream.write(i);
        //4.关闭流对象以及Scanner扫描器
        fileOutputStream.close();
        sc.close();
    }
}
