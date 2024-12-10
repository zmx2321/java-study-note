package com.my.test01;

public class TestVar {
    public static void main(String[] args) {
        /* 整型 */
        byte a = 10;  // -128-127
        short b = 20;  // 正负3w
        int c = 30;  // 正负21亿
        long d = 12345678901L;  // 很大,如果表示的数超过int类型,需要在后面加L

        /* 浮点型 */
        float e = 3.14f;  // 需要加f
        double f = 3.14;  // 小数点后面位数多的用double

        /* 字符型 */
        // 字符串是多个字符拼接
        char g = 'a';  // 单引号 - 字符

        /* 布尔类型 */
        boolean flag = true;
    }
}
