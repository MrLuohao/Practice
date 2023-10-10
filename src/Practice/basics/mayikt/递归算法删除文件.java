package Practice.basics.mayikt;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * @Title: 递归算法删除文件
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/8 18:19
 * @description: 递归算法删除目录下所有文件
 */
public class 递归算法删除文件 {
    //定义方法删除指定目录下的所有文件
    public static void deleteAllFile(File file) {
        //1.获取该文件下的所有文件
        File[] files = file.listFiles();
        //2.判断该文件下是否存在文件，如果不存在则直接返回
        if (files == null) return;
        //3.如果有文件存在则判断是文件夹还是文件
        for (File f : files) {
            //4.如果是文件夹，则采用递归思想继续遍历文件夹
            if (f.isDirectory()) {
                deleteAllFile(f);
                //6.最后删除该文件夹（删除文件夹之前必须先删除该文件夹里的所有文件）
                f.delete();
            } else {
                //5.如果是文件则直接删除
                f.delete();
            }
        }
        System.out.println(file.getAbsolutePath() + "文件夹下的所有文件已删除");
    }

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\File\\day02");
        deleteAllFile(file);
        /*long l = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(l));
        Runtime.getRuntime().exec("notepad");//打开记事本
        System.out.println(Runtime.getRuntime().maxMemory());//查看虚拟机运行最大内存容量
        System.out.println(Runtime.getRuntime().freeMemory());//查看虚拟机剩余内存容量
        Process notepad = Runtime.getRuntime().exec("notepad");//exec会返回一个Process对象，该对象为执行命令的进程
        notepad.destroy();//使用该方法可以销毁该线程*/
    }
}
