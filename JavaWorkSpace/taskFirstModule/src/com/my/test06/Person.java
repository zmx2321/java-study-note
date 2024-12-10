package com.my.test06;

/**
 * 父类
 */
public class Person {
    // 父类公共的属性
    private String name;
    private int age;
    private double height;

    // 父类公共方法
    // get/set方法 - 私有属性无法直接调用,
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 其他方法
    public void eat() {
        System.out.println("eat");
    }
    public void sleep() {
        System.out.println("sleep");
    }
}
