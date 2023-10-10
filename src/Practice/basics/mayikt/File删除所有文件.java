package Practice.basics.mayikt;

import java.io.File;

/**
 * @Title: File删除所有文件
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/8 16:35
 * @description: File删除文件夹中的所有文件
 */
public class File删除所有文件 {
    public static void deletes(File file) {
        //1.获取到该目录中的所有文件
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                deletes(f);
                //2.删除目录
                f.delete();
                System.out.println("删除" + f.getAbsolutePath() + "目录成功");
            } else {
                f.delete();
                System.out.println("删除文件" + f.getAbsolutePath() + "成功");
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("D:\\File\\day02");
        if (file.isDirectory()) {
            System.out.println("删除的是一个文件夹目录");
            deletes(file);
            file.delete();
        } else if (file.isFile()) {
            System.out.println("删除的是一个文件");
            file.delete();
        } else {
            System.out.println("不存在该文件");
        }

    }
}
