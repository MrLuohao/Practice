package Practice.basics.mayikt;

import java.io.*;

/**
 * @Title: FileWriter拷贝文件
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/10 21:18
 * @description: 使用FileWriter、FileReader拷贝文件
 */
public class FileWriter拷贝文件 {
    public static void main(String[] args) throws IOException {
        //FileReader以及FileWriter底层还是对InputStreamReader和OutputStreamWriter的封装再底层又是对FileInputStream和FileOutputStream进行了封装
        FileReader fileReader = new FileReader("D:\\File\\java.txt");//等于InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("D:\\File\\java.txt"));
        FileWriter fileWriter = new FileWriter("D:\\File\\test\\java.txt");
        int len;
        char[] chars = new char[1024];
        while ((len = fileReader.read(chars)) != -1) {
            fileWriter.write(chars, 0, len);
        }
        System.out.println("文件拷贝成功");
        fileReader.close();
        fileWriter.close();
    }
}
