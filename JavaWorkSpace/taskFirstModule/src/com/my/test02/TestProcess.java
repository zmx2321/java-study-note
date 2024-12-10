package com.my.test02;

public class TestProcess {
    public static void main(String[] args) {
        // 定义变量
        int num = 1;
        // 定义一个变量接收
        int sum = 0;
        int sum1 = 0;

        // 循环 - 条件初始化、条件判断、循环体、迭代
        while (num <= 100) {
            sum += num;
            num++;
        }

        for (int num1 = 1; num1 <= 100; num1++) {
            sum1 += num1;
        }

        System.out.println("和: " + sum + " " + sum1);
    }
}
