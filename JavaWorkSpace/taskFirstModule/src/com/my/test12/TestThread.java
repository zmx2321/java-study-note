package com.my.test12;

/**
 * 创建一个线程类 - 具备多线程能力
 */
public class TestThread extends Thread {
    // 线程对应的任务放在一个方法
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("子线程----" + i);
        }
    }
}