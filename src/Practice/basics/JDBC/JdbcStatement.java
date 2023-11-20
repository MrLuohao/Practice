package Practice.basics.JDBC;

import java.sql.*;

/**
 * @Title: JdbcStatement
 * @Author Mr.罗
 * @Package Practice.basics
 * @Date 2023/10/28 21:00
 * @description: 使用JDBC中的statement对象连接数据库实现对数据库数据的更新
 */
public class JdbcStatement {
    public static void main(String[] args) throws Exception {
        //1.使用反射机制创建mysql数据库驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.设置数据库连接参数
        String name = "root";
        String password = "123456";
        String url = "jdbc:mysql://192.168.0.112:3306/db9?useUnicode=true&characterEncoding=UTF-8";
        //3.根据参数获得连接
        Connection connection = DriverManager.getConnection(url, name, password);
        //4.获取语句执行平台
//        Statement statement = connection.createStatement();
        //5.创建对应的sql文件
        String sql = "select * from test";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery(sql);
        //6.执行对应的sql语句返回resultSet集合对象
//        ResultSet resultSet = statement.executeQuery(sql);
        //7.遍历集合对象打印出结果
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String Sname = resultSet.getString("name");
            String age = resultSet.getString("age");
            String sex = resultSet.getString("sex");
            System.out.println("id:" + id + "\tname:" + Sname + "\t性别:" + sex + "\tage:" + age);
        }
        String sql1 = "update test set name='王桢',age=23 where id=1";
        preparedStatement.executeUpdate(sql1);
        //8.释放资源
        connection.close();
//        statement.close();
        preparedStatement.close();
        resultSet.close();
    }
}
