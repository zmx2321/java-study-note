package com.my.test10;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 定义一个集合对象
        ArrayList<String> list = new ArrayList<String>();

        // 增加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        // 删除元素
        list.remove("ccc");
        System.out.println(list);

        // 修改元素
        list.set(2, "fff");
        System.out.println(list);

        // 查看元素
        System.out.println(list.get(2));

        // 遍历
        // for
        for (String s : list) {
            System.out.println(s);
        }
    }
}
