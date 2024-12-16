package com.my.test02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TestJDBC {
    private static  String DRIVER;
    private static  String URL;
    private static  String USER;
    private static  String PASSWORD;

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        //用来存放从配置文件中读取的信息
        Properties props = new Properties();
        //读取配置文件，转成流
        InputStream ism = TestQuery.class.getResourceAsStream("jdbcinfo.properties");
        //读取流中的信息
        props.load(ism);

        // 获取流中的信息存储到静态变量中
        // 加载驱动
        DRIVER = props.getProperty("mysql.driver");
        URL = props.getProperty("mysql.url");
        USER = props.getProperty("mysql.user");
        PASSWORD = props.getProperty("mysql.password");
        System.out.println(DRIVER);

        // 获取连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

        // 创建会话
        Statement sta =  conn.createStatement();

        // 发送sql
        int i = sta.executeUpdate("INSERT INTO Users values(12, 'ysrt', '女', 7, 1)");
        // 处理结果 - 表示影响了i条数据
        // 证明对数据库的数据条数有影响
        if(i > 0) {
            System.out.println("插入成功");
        }

        // 关闭资源
        sta.close();
        conn.close();
    }
}
