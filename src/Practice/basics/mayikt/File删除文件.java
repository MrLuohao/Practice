package Practice.basics.mayikt;

import java.io.File;
import java.io.IOException;

/**
 * @Title: File删除文件
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/8 16:24
 * @description: File删除文件
 */
public class File删除文件 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\File\\test");
        System.out.println(file1.mkdir());
        File file2 = new File("D:\\File\\test\\mayikt.java");
        System.out.println(file2.createNewFile());
        //删除文件或者文件夹 delete
        System.out.println(file1.delete());//如果删除的路径是文件夹路径，则需要先将文件夹中的文件删除才能删除文件夹
        System.out.println(file2.delete());//如果删除的是文件，则直接删除
        System.out.println(file1.delete());
    }
}
