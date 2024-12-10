package com.my.test05;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Girl g = new Girl();
        // g.age = 33;
        // System.out.println("age = " + g.age);

        g.setAge(33);
        System.out.println(g.getAge());
    }
}
