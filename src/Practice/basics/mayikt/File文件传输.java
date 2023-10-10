package Practice.basics.mayikt;

import java.io.File;

/**
 * @Title: File文件传输
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/8 15:12
 * @description: File文件传输
 */
public class File文件传输  {
    /*
    io:对磁盘中的文件做一些操作
     */
    public static void main(String[] args) {
        File file1 = new File("D:\\File\\mayikt.txt");
        System.out.println(file1);
        File file2 = new File("D:\\File\\", "mayikt.txt");
        System.out.println(file2);
        File file3 = new File("D:\\File\\");
        File file4 = new File(file3, "mayikt.txt");
        System.out.println(file4);
    }
}
