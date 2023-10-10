package Practice.basics.mayikt;

import java.io.File;

/**
 * @Title: File文件的获取
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/8 15:58
 * @description: File文件的获取
 */
public class File文件的获取 {
    public static void main(String[] args) {
        File file = new File("D:\\File");
        System.out.println(file.getAbsolutePath());//获取该file完整路径地址，绝对路径地址
        System.out.println(file.getPath());//获取抽象路径名转换为字符串
        System.out.println(file.getName());//如果该路径是文件路径，那么获取到的就是文件名称，如果该路径是文件夹，那么获取到的是文件夹名称
        String[] list = file.list();//获取当前路径下的所有文件
        System.out.println("------返回字符串类型------");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("------返回文件类型------");
        File[] files = file.listFiles();
        for (File f:files) {
            System.out.println(f.getName());
        }
    }
}
