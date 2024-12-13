package com.my.test13;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器端启动");

        // 套接字
        ServerSocket ss = new ServerSocket(8888);

        // 等待客户端发送数据
        Socket s = ss.accept();

        // 服务器感受到输入流
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        // 接收客户端发送的数据
        String str = dis.readUTF();
        System.out.println(str);

        // 流、网络资源关闭
        // 从下往上关闭
        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}
