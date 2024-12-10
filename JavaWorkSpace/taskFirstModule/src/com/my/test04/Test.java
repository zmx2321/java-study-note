package com.my.test04;

/**
 * 测试类
 */
public class Test {
    // 程序入口
    public static void main(String[] args) {
        // 对person类对象进行创建,创建了person对象,名字叫p1
        Person p1 = new Person();
        // 对属性进行赋值
        p1.name = "111";
        p1.age = 18;
        p1.height = 190;

        p1.study();
    }
}
