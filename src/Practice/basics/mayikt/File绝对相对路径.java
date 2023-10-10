package Practice.basics.mayikt;

import java.io.File;
import java.io.IOException;

/**
 * @Title: File绝对相对路径
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/8 16:13
 * @description: 绝对路径相对路径
 */
public class File绝对相对路径 {
    public static void main(String[] args) throws IOException {
        //绝对路径：物理磁盘真实存在的路径
        //相对路径：相对路径是java工程中要访问的文件相对于当前文件的位置
        File file = new File("D:\\File\\maykt02.java");
        System.out.println(file.createNewFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        //绝对路径是写死的，相对路径动态获取路径会更灵活，工作中更多时间使用的是相对路径
    }
}
