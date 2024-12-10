package com.my.test08;

public class Girl {
    /*// 玩的时候要把具体的小猫传进去
    public void play(Cat cat) {
        cat.shout();  // 猫开心了会叫
    }

    // 方法重载 - 同一个类,方法名相同,参数列表不同
    public void play(Dog dog) {
        dog.shout();
    }*/

    // 上面可以不写,猫和狗都属于animal类(继承)
    public void play(Animal animal) {
        animal.shout();
    }
}
