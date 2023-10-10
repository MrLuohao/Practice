package Practice.basics.mayikt;

import java.io.File;

/**
 * @Title: 递归实现遍历目录
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/8 18:02
 * @description: 递归算法实现遍历目录
 */
public class 递归实现遍历目录 {
    //使用递归算法实现查找目录中的所有文件信息
    public static void findAllFile(File file) {
        File[] files = file.listFiles();
        if (files == null) return;
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getAbsolutePath());
            } else {
                findAllFile(f);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("D:\\File\\day02");
        findAllFile(file);
    }
}
