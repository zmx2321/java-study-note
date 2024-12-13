package com.my.test12;

/**
 * 线程
 * 继承Thread类
 * 程序中无论有多少个线程,总有一个主线程,就是main方法
 */
public class Test {
    // main方法作为程序的入口,里面执行的逻辑/任务就是主线程的任务
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println("main---" + i);
        }

        // 创建子线程对象,执行任务
        TestThread t = new TestThread();
        // 执行任务,不是直接调用run方法,而是要将线程启动
        // 一旦子线程启动,就会和主线程争抢cpu资源
        t.start();

        // 主线程中再加一个循环
        for (int i = 0; i < 1000; i++) {
            System.out.println("main--main----" + i);
        }
    }
}