package com.my.test04;

public class Test02 {
    public static void main(String[] args) {
        /**
         * 创建一个Person类的对象
         * new Person()
         * Person() => 空构造方法
         * new关键字对方法进行调用  => 构造器作用: 底层帮我们创建对象,在创建对象以后进行初始化操作
         *
         * 如果一个类没有显示编写构造器的话,那么系统会为这个类默认分配一个空构造器
         * 即实际上类里面有一个隐藏的Person方法
         * 调用构造器之后,对对象进行初始化操作,将对象的地址返回给p1
         *
         * 以后尽量保证空构造器的存在,某些框架底层需要空构造器,没有可能会报错
         *
         * 如果一个类中有构造器,系统就不会帮你分配默认的空构造器
         */
        Person p1 = new Person("11", 11, 110);
        Person p2 = new Person("12", 12, 110);

        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
