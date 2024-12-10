package com.my.test03;

public class TestArray {
    public static void main(String[] args) {
        /* // 声明数组
        int[] arr;
        // 创建数组
        arr = new int[3];  // 在创建的时候要给定数组的长度,创建一个长度为3的int类型的数组*/
        // 声明和创建合成一句话
        // 底层默认长度为3的空间中,每个元素有默认值: 0
        int[] arr = new int[3];
        // 数组赋值
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0]);

        // 遍历
        for (int num : arr) {
            // 对arr数组进行遍历,遍历出来的每一个元素用num变量接收
            // 每次循环输出num的数值
            System.out.println(num);
        }
    }
}
