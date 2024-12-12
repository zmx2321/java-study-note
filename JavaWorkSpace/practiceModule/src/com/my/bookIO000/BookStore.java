package com.my.bookIO000;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * 书店
 * 1. 展示书籍
 * 2. 上新书籍
 * 3. 下架书籍
 * 4. 退出应用
 */

public class BookStore {
    static Scanner input = new Scanner(in);
    public static int choice;
    // public  static ArrayList<Book> bookList = null;
    public static File file = new File("/Users/zmx2321/Documents/code/_poj/aa.txt");

    /**
     * 主页面
     */
    public static void homePage(){
        // 打印菜单
        com.my.book.BookStore.homePage();
    }

    /**
     * 公用退出方法
     */
    public static void exit() {
        out.println("谢谢使用本系统，欢迎您再次光临！！！");
        System.exit(0);
    }

    /**
     * 选择
     */
    public static void select(int choice) throws IOException {
        // 根据choice录入的功能进行后续判断
        switch (choice) {
            case 1 -> {
                out.println("「书店应用」 >>>>> 1. 展示书籍\n");
                checkBook();
            }
            case 2 -> {
                out.println("「书店应用」 >>>>> 2. 上新书籍\n");
                addBook();
            }
            case 3 -> {
                out.println("「书店应用」 >>>>> 3. 下架书籍\n");
                removeBook();
            }
            case 4 -> {
                out.println("「书店应用」 >>>>> 4. 退出应用\n");
                exit();
            }
        }
    }

    /**
     * 书籍的增删改查
     */
    // 新增
    public static void addBook() throws IOException {
        out.println("请录入书籍编号:");
        int bNo = input.nextInt();  // 录入书籍编号
        out.println("请录入书籍名称:");
        String bName = input.next();  // 录入书籍编号
        out.println("请录入书籍作者:");
        String bAuthor = input.next();  // 录入书籍作者

        // 每上新一本书,创建一个书籍对象
        Book book = new Book(bNo, bName, bAuthor);

        // 创建一个集合,存放相同的个体 => 书籍对象
        ArrayList<Book> bookList = new ArrayList<>();
        // bookList = new ArrayList<>();
        bookList.add(book);
        out.println(bookList);

        // 将集合对象写出到硬盘盘符文件中
        // 文件
        // File file = new File("/Users/zmx2321/Documents/code/_poj/aa.txt");
        // 流 - 管道
        // 需要一个流,这个流外面又套一个流 => 管套管
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);  // 处理流

        // 将bookList写出
        oos.writeObject(bookList);

        // 关闭流
        oos.close();

        out.println("添加成功!\n");
        // System.out.println(bookList);
    }

    // 查询
    public static void checkBook() throws IOException {
        // 在文件中读取 - 流
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 读取
        ArrayList bookList = null;
        try {
            bookList = (ArrayList)(ois.readObject());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 关闭流
        ois.close();

        if(bookList.isEmpty()){
            out.println("暂无书籍,快去上新书籍吧!\n");
            return;
        }

        for (Object book : bookList) {
            out.println(book);
        }

        out.println("查询成功!\n");
    }

    // 下架书籍
    public static void removeBook(){
        /*if(bookList.isEmpty()){
            System.out.println("暂无书籍,快去上新书籍吧!\n");
            return;
        }

        System.out.println("请录入要下架的书籍编号:");
        int bNo = input.nextInt();

        // 从集合中删除该书籍
        bookList.removeIf(book -> book.getbNo() == bNo);*/

        out.println("下架成功!\n");
    }

    /**
     * 开始
     */
    public static void start() {
        while(true) {
            try {
                homePage();  // 主界面
                choice = input.nextInt();  // 录入序号
                select(choice);
            } catch (IOException e) {
                out.println("您输入的格式不正确，请重新输入");
                input = new Scanner(in);
            }
        }
    }
}