package Practice.basics.mayikt;

import java.io.File;
import java.io.IOException;

/**
 * @Title: File文件判断
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/8 15:48
 * @description: File文件判断
 */
public class File文件判断 {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\File\\mayikt1.java";
        File file1 = new File(fileName);
        System.out.println(file1.isFile());//判断指定文件是否为文件，返回true，false
        System.out.println(file1.isDirectory());//判断文件是否为文件夹，返回true，false
        if (file1.isFile()) {
            System.out.println("是文件");
        } else if (file1.isDirectory()) {
            System.out.println("是文件夹");
        }
        //判断文件是否存在，存在返回true，不存在返回false
        if (file1.exists()) {
            System.out.println("文件存在");
        } else {
            System.out.println("文件不存在");
            file1.createNewFile();//如果不存在就创建文件
            System.out.println("已自动创建该文件");
        }
    }
}
