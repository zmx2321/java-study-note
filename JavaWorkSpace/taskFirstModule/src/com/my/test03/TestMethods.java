package com.my.test03;

public class TestMethods {
    // 提取方法,将两个数求和
    // [方法修饰符] [方法的返回值对应的数据类型] [方法名] [形参列表]
    // 没有返回值 用void
    public static int addNum(int num1, int num2) {
        return num1 + num2;
    }

    public static int addNum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int sum = addNum(10, 20);  // 实参列表
        System.out.println(sum);

        int sum1 = addNum(10, 20, 30);  // 实参列表
        System.out.println(sum1);
    }
}
