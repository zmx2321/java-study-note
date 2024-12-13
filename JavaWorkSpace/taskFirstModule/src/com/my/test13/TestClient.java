package com.my.test13;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 */
public class TestClient {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");

        // 套接字 - 指定服务器的ip和端口
        Socket s = new Socket("192.168.2.1", 8888);

        // 利用输出流传送数据
        OutputStream os = s.getOutputStream();
        // 数据流
        DataOutputStream dos = new DataOutputStream(os);

        // 利用数据流往外传送数据
        dos.writeUTF("hello");

        // 流、网络资源关闭
        dos.close();
        os.close();
        s.close();
    }
}
