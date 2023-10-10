package Practice.basics.mayikt;

import java.io.File;
import java.io.IOException;

/**
 * @Title: File创建功能
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/8 15:28
 * @description: File创建功能
 */
public class File创建功能 {
    public static void main(String[] args) throws IOException {
        //需求1：在D盘File文件夹下创建mayikt.java文件
        File file1 = new File("D:\\File\\mayikt.java");
        //createNewFile  如果成功创建该文件返回true否则返回false（如果文件存在返回false）
        System.out.println(file1.createNewFile());
        //需求2：在D盘File文件夹下创建文件夹day01
        File file2 = new File("D:\\File\\day01");
        //mkdir 创建参数指定路径下的文件夹，如果存在就创建返回true如果不存在就返回false
        System.out.println(file2.mkdir());
        //需求3：在D盘File文件夹下创建day02\day03文件夹
        File file3 = new File("D:\\File\\day02\\day03");
        //mkdirs  创建多个文件夹，先判断再创建，先判断是否有File文件夹，如果有继续判断是否有day02文件夹，没有就创建，以此类推
        System.out.println(file3.mkdirs());
    }
}
