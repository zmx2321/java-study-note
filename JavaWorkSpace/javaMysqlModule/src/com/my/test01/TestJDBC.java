package com.my.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 获取连接
        String url = "jdbc:mysql://localhost:3306/myTest";
        String user = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, user, password);

        // 创建会话
        Statement sta =  conn.createStatement();

        // 发送sql
        int i = sta.executeUpdate("INSERT INTO Users values(11, 'ysrt', '女', 7, 1)");
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
