package com.my.test05;

public class Girl {
    private int age;

    // 给age提供一个赋值的方法 - 需要外部可以调用,用public
    public void setAge(int age) {
        this.age = age;
    }

    // 给age提供一个读取的方法 - 需要外部可以调用
    public int getAge() {
        return age;
    }
}
