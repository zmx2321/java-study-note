package com.my.test08;

public class Cat extends Animal {
    // 重写父类方法
    // 父类方法不满足子类方法
    public void shout() {
        System.out.println("Cat shout");
    }

    public void scratch() {
        System.out.println("scratch");
    }
}
