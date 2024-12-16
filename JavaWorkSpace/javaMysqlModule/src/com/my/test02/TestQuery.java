package com.my.test02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class TestQuery {
    private static  String DRIVER;
    private static  String URL;
    private static  String USER;
    private static  String PASSWORD;

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        //用来存放从配置文件中读取的信息
        Properties props = new Properties();
        //读取配置文件，转成流
        InputStream ism = TestJDBC.class.getResourceAsStream("jdbcinfo.properties");
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

        // 发送sql - 结果集
        ResultSet rs = sta.executeQuery("select * from Users");

        // 处理结果
        // 判断是否有记录存在
        while (rs.next()) {
            System.out.println(
                "id:" + rs.getString(1) +
                " 昵称:" + rs.getString(2) +
                " 性别:" + rs.getString(3) +
                " 星座:" + rs.getString(4) +
                " 血型:" + rs.getString(5)
            );
        }

        // 关闭资源
        sta.close();
        conn.close();
    }
}
