package com.my.book;

import java.util.Scanner;

/**
 * 书店
 * 1. 展示书籍
 * 2. 上新书籍
 * 3. 下架书籍
 * 4. 退出应用
 */

public class Test {
    public static void main(String[] args) {
        /*
          程序入口
         */
        // 打印菜单
        System.out.println("*********************");
        System.out.println("***欢迎来到书店***");
        System.out.println("1. 展示书籍");
        System.out.println("2. 上新书籍");
        System.out.println("3. 下架书籍");
        System.out.println("4. 退出应用");
        System.out.println("*********************");

        // 引用扫描类
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入你想要执行的功能序号: ");

        // 录入序号
        int choice = sc.nextInt();
        // System.out.println(choice);

        // 根据choice录入的功能进行后续判断
        switch (choice) {
            case 1:
                System.out.println("「书店应用」 >>>>> 1. 展示书籍");
                break;
            case 2:
                System.out.println("「书店应用」 >>>>> 2. 上新书籍");
                break;
            case 3:
                System.out.println("「书店应用」 >>>>> 3. 下架书籍");
                break;
            case 4:
                System.out.println("「书店应用」 >>>>> 4. 退出应用");
                break;
        }
    }
}
