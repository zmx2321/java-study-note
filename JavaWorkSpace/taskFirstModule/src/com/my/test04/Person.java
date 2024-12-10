package com.my.test04;

/**
 * 定义类: 模板
 */
public class Person {
    // 特性 - 属性
    String name;  // 姓名
    int age;  // 年龄
    double height;  // 身高

    // 显示编写空构造器
    public Person() {
        System.out.println("空构造器");
    }

    // 构造器参数名,如果和属性名重复,会发生就近原则
    // 重名以后,如果要给属性赋值,那么就要在想表达属性的变量前加上this来修饰
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // 行为 - 方法
    public void study() {
        System.out.println("study 111111");
    }
}
