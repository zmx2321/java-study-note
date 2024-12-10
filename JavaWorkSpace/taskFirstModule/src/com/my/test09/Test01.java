package com.my.test09;

public class Test01 {
    public static void main(String[] args) {
        try {
            System.out.println(12/0);
        } catch (Exception e) {
            // 将try中出现的异常组成对象,和Exception对象做匹配输出
            System.out.println(e.getMessage());
        } finally {
            System.out.println("程序无论是否出异常,逻辑必须会执行,finally");
        }
    }
}
