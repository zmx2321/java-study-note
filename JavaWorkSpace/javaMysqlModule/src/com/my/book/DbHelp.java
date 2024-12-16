package com.my.book;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DbHelp {
    private static  String DRIVER;
    private static  String URL;
    private static  String USER;
    private static  String PASSWORD;

    //注册驱动并建立连接
    public static Connection getConnection() throws IOException, SQLException {
        Connection conn = null;

        //用来存放从配置文件中读取的信息
        Properties props = new Properties();
        //读取配置文件，转成流
        InputStream ism = DbHelp.class.getResourceAsStream("jdbcinfo.properties");
        //读取流中的信息
        props.load(ism);

        // 获取流中的信息存储到静态变量中
        // 加载驱动
        DRIVER = props.getProperty("mysql.driver");
        URL = props.getProperty("mysql.url");
        USER = props.getProperty("mysql.user");
        PASSWORD = props.getProperty("mysql.password");

        // 获取连接
        conn = DriverManager.getConnection(URL, USER, PASSWORD);

        return conn;
    }

    //关闭数据库
    public static void closeAll(Connection conn, PreparedStatement ps, ResultSet rs) {
        if (rs!= null) {
            try {
                rs.close();
                rs = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (ps!= null) {
            try {
                ps.close();
                ps = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn!= null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //关闭数据库 - 删除
    public static void closeAll(Connection conn, PreparedStatement ps) {
        if (ps!= null) {
            try {
                ps.close();
                ps = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn!= null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
