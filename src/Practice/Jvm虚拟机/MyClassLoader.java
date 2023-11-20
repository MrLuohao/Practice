package Practice.Jvm虚拟机;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Title: MyClassLoader
 * @Author Mr.罗
 * @Package Practice.Jvm虚拟机
 * @Date 2023/10/18 20:15
 * @description: 自定义类加载器
 */
public class MyClassLoader extends ClassLoader {   //自定义类加载器肯定要先继承ClassLoader这个父类
    //自定义字节码文件路径
    private String codePath;

    //生成构造方法
    public MyClassLoader(String name, ClassLoader parent, String codePath) {
        super(name, parent);
        this.codePath = codePath;
    }

    public MyClassLoader(ClassLoader parent, String codePath) {
        super(parent);
        this.codePath = codePath;
    }

    public MyClassLoader(String codePath) {
        this.codePath = codePath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {   //自定义类加载器重写的核心方法
        //1.声明输入流读取文件到内存中
        BufferedInputStream bis = null;
        //2.声明输出流写文件到指定路径中
        ByteArrayOutputStream bos = null;
        try {
            //3.指定文件路径
            String file = codePath + name + ".class";
            //4.初始化输入输出流
            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new ByteArrayOutputStream();
            //5.读取写入文件
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            //6.将输出流中(内存)的数据转换为字节数组
            byte[] byteArray = bos.toByteArray();
            //7.调用defineClsss将字节数组转换为class实例
            Class<?> clazz = defineClass(null, byteArray, 0, byteArray.length);
            //8.返回class对象
            return clazz;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //9.释放资源
                if (bis != null && bos != null) {
                    bis.close();
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null; //如果返回null表示自定义类加载器也加载不了
    }
}
