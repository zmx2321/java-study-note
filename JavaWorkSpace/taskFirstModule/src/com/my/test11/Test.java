package com.my.test11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 对文件进行操作,必须将文件封装为具体的file类对象
        File file = new File("/Users/zmx2321/Documents/code/_poj/aa.txt");
        // 输入字符流
        FileReader fr = new FileReader(file);

        // 开始动作 - 读取
        /*int n1 = fr.read();
        System.out.println(n1);*/
        int n = fr.read();
        // 当读取到-1时,表示没有数据流,终止循环
        while (n != -1) {
            System.out.println(n);
            n = fr.read();
        }

        // 关闭流
        fr.close();
    }
}
