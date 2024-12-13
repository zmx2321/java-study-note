package com.my.test13;

import java.io.*;
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
        dos.writeUTF("你好, 服务器, 我是客户端");

        // 对服务器返回的数据做处理
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("服务器对我说:" + str);

        // 流、网络资源关闭
        dos.close();
        os.close();
        s.close();
    }
}
