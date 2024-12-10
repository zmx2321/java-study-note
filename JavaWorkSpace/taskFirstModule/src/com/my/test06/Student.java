package com.my.test06;

/**
 * 子类
 */
public class Student extends Person {
    // 定义子类额外的属性
    private int sno;

    // 定义子类额外的方法
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void study() {
        System.out.println("study");
    }
}
