package com.my.test08;

public class Dog extends Animal {
    // 重写父类方法
    // 父类方法不满足子类方法
    public void shout() {
        System.out.println("Dog shout");
    }

    public void guard() {
        System.out.println("guard");
    }
}
