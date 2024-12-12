package com.my.test11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 将程序中的内容输出到文件中
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        String str = "233333";

        // 对文件进行操作,必须将文件封装为具体的file类对象
        File file = new File("/Users/zmx2321/Documents/code/_poj/aa.txt");

        // 输出字符流
        FileWriter fw = new FileWriter(file);

        // 开始动作
        fw.write(str);

        // 关闭流
        fw.close();
    }
}
