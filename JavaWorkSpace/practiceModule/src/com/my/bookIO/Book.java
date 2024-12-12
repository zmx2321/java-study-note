package com.my.bookIO;

import java.io.Serializable;

/**
 * 书籍实体类
 */
// 加了Serializable就具备写入文件的能力
public class Book implements Serializable {
    // 属性
    private int bNo;  // 编号
    private String bName;  // 书名
    private String bAuthor;  // 作者

    // 方法
    // 构造器
    public Book() {}
    public Book(int bNo, String bName, String bAuthor) {
        this.bNo = bNo;
        this.bName = bName;
        this.bAuthor = bAuthor;
    }
    // get/set
    public int getbNo() {
        return bNo;
    }
    public void setbNo(int bNo) {
        this.bNo = bNo;
    }
    public String getbName() {
        return bName;
    }
    public void setbName(String bName) {
        this.bName = bName;
    }
    public String getbAuthor() {
        return bAuthor;
    }
    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }
    // 输出
    @Override
    public String toString() {
        return "{" +
                "书籍编号='" + bNo + '\'' +
                ", 书籍名称='" + bName + '\'' +
                ", 书籍作者='" + bAuthor + '\'' +
                '}';
    }
}
