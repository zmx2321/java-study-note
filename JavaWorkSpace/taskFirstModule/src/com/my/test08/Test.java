package com.my.test08;

public class Test {
    public static void main(String[] args) {
        // 创建girl实例
        Girl girl = new Girl();

        /* // 创建cat实例
        Cat cat = new Cat();
        // 创建dog实例
        Dog dog = new Dog();
        // girl玩cat
        girl.play(cat);  // 具体的小女孩和具体的小猫在玩
        // girl玩dog
        girl.play(dog);*/

        /*// 多态雏形
        Animal animal;  // 定义一个动物,这个动物是什么未知
        Cat cat = new Cat();  // 具体的猫
        // 重写的目的就是为了,让父类引用指向子类对象
        animal = cat;  // 让这个动物是一只具体的猫*/

        // 上面三句话可以合成一句话
        Animal cat = new Cat();
        Animal dog = new Dog();
        girl.play(cat);
        girl.play(dog);
    }
}